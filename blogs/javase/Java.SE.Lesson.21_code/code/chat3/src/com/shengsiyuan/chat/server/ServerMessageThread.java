package com.shengsiyuan.chat.server;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import com.shengsiyuan.chat.util.CharacterUtil;
import com.shengsiyuan.chat.util.XMLUtil;

public class ServerMessageThread extends Thread
{
	private Server server;
	
	private InputStream is;
	
	private OutputStream os;
	
	public ServerMessageThread(Server server, Socket socket)
	{
		try
		{
			this.server = server;
			
			this.is = socket.getInputStream();
			
			this.os = socket.getOutputStream();
		}
		catch(Exception ex)
		{
			
		}
	}
	
	// �����û��б�
	// ���ȸ��·������˵��û��б�
	// Ȼ����¿ͻ��˵��û��б�
	public void updateUserList()
	{
		//����û����ļ���
		Set<String> users = this.server.getMap().keySet();
		//������ͻ��˷��͵������û��б�����xml
		String xml = XMLUtil.constructUserList(users);
		
		String str = "";
		
		for(String user : users)
		{
			str += user + "\n";
		}
		
		//���ȸ��·������˵��û��б�
		this.server.getJTextArea().setText(str);
		
		Collection<ServerMessageThread> cols = this.server.getMap().values();
		
		//������ÿһ���ͻ��˶�Ӧ���̣߳���ÿһ���ͻ��˷��������û��б�
		for(ServerMessageThread smt : cols)
		{
			smt.sendMessage(xml);
		}
	}
	
	//��ͻ��˷�������
	public void sendMessage(String message)
	{
		try
		{
			os.write(message.getBytes());
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	@Override
	public void run()
	{
		while(true)
		{
			try
			{
				byte[] buf = new byte[5000];
				
				int length = this.is.read(buf);
				
				//�ͻ��˷�������Ϣ
				String xml = new String(buf,0,length);
				
				int type = Integer.parseInt(XMLUtil.extractType(xml));
				
				// ��������
				if(CharacterUtil.CLIENT_MESSAGE == type)
				{
					//�û�����˭��������Ϣ��
					String username = XMLUtil.extractUsername(xml);
					//������ı�����
					String content = XMLUtil.extractContent(xml);
					
					//���������пͻ��˷��͵���Ϣ
					String message = username + " : " + content;
					//�����пͻ��˷��͵�XML��������
					String messageXML = XMLUtil.constructServerMessageXML(message);
					
					Map<String, ServerMessageThread> map = this.server.getMap();
					
					Collection<ServerMessageThread> cols = map.values();
					
					for(ServerMessageThread smt : cols)
					{
						//��XML�������ݷ��͸�ÿһ���ͻ���
						smt.sendMessage(messageXML);
					}
				}
				// �رտͻ��˴���
				else if(CharacterUtil.CLOSE_CLIENT_WINDOW == type)
				{
					String username = XMLUtil.extractUsername(xml);
					//��ô�ɾ���û�����Ӧ���̶߳���
					ServerMessageThread smt = this.server.getMap().get(username);
					//�������ͻ���ȷ�Ϲرյ�XML��Ϣ
					String confirmationXML = XMLUtil.constructCloseClientWindowConfirmationXML();
					//��ͻ��˷�������һ��ȷ����Ϣ
					smt.sendMessage(confirmationXML);
					
					// ���û��б��Map�н����û�ȥ��
					this.server.getMap().remove(username);
					// ���������û��б�
					this.updateUserList();
					
					this.is.close();
					this.os.close();
					
					break; // �������߳�
				}				
			}
			catch(Exception ex)
			{
				
			}
		}
	}
}
