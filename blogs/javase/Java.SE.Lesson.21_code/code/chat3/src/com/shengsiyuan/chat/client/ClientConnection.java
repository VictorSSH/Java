package com.shengsiyuan.chat.client;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;

import javax.swing.JOptionPane;

import com.shengsiyuan.chat.util.CharacterUtil;
import com.shengsiyuan.chat.util.XMLUtil;

public class ClientConnection extends Thread
{
	private String hostAddress;
	
	private int port;
	
	private String username;
	
	private Client client;
	
	private Socket socket;
	
	private InputStream is;
	
	private OutputStream os;
	
	private ChatClient chatClient;
	
	public ClientConnection(Client client, String hostAddress, int port, String username)
	{
		this.client = client;
		this.hostAddress = hostAddress;
		this.port = port;
		this.username = username;
		
		//���ӷ�����
		this.connect2Server();	
	}

	// ���ӷ��������ɹ��췽������
	private void connect2Server()
	{
		try
		{
			this.socket = new Socket(this.hostAddress, this.port);
			
			this.is = this.socket.getInputStream();
			this.os = this.socket.getOutputStream();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	// �û���¼����������˴����û���
	// ����true��ʾ��¼�ɹ�
	// ����false��ʾ��¼ʧ��
	public boolean login()
	{
		try
		{
			String xml = XMLUtil.constructLoginXML(this.username);
			
			os.write(xml.getBytes()); // ��������˷����û��ĵ�¼��Ϣ�����а������û�����
			
			byte[] buf = new byte[5000];
			int length = is.read(buf); // ��ȡ�������˵���Ӧ������ж��û��Ƿ��¼�ɹ�
			
			String loginResultXML = new String(buf, 0, length);
			
			String loginResult = XMLUtil.extractLoginResult(loginResultXML);
			
			// ��¼�ɹ�
			if("success".equals(loginResult))
			{
				//��������������
				this.chatClient = new ChatClient(this);
				
				this.client.setVisible(false);
				
				return true;
			}
			// ��¼ʧ��
			else
			{
				return false;
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return false;
	}
	
	public Socket getSocket()
	{
		return socket;
	}

	public void sendMessage(String message, String type)
	{
		try
		{
			int t = Integer.parseInt(type);
			
			String xml = null;
			
			//�ͻ�����������˷�����������
			if(CharacterUtil.CLIENT_MESSAGE == t)
			{
				xml = XMLUtil.constructMessageXML(this.username, message);
			}
			//�ͻ�����������˷��͹رմ��ڵ�����
			else if(CharacterUtil.CLOSE_CLIENT_WINDOW == t)
			{
				xml = XMLUtil.constructCloseClientWindowXML(this.username);
			}
			
			//��������˷�������
			this.os.write(xml.getBytes());
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	@Override
	public void run()
	{
		try
		{
			while(true)
			{
				byte[] buf = new byte[5000];
				int length = is.read(buf);
				
				String xml = new String(buf, 0, length);
				
				int type = Integer.parseInt(XMLUtil.extractType(xml));
				
				//�����û��б�
				if(type == CharacterUtil.USER_LIST)
				{
					List<String> list = XMLUtil.extractUserList(xml);
					
					String users = "";
					
					for(String user : list)
					{
						users += user + "\n";
					}
					
					this.chatClient.getJTextArea2().setText(users);
				}
				// �������˷�������������
				else if(type == CharacterUtil.SERVER_MESSAGE)
				{
					String content = XMLUtil.extractContent(xml);
					
					this.chatClient.getJTextArea1().append(content + "\n");
				}
				// �رշ������˴���
				else if(type == CharacterUtil.CLOSE_SERVER_WINDOW)
				{
					JOptionPane.showMessageDialog(this.chatClient, "���������ѹرգ������˳���", "��Ϣ", JOptionPane.INFORMATION_MESSAGE);
					
					System.exit(0); //�ͻ����˳�
				}
				// ��������ȷ�Ϲرտͻ��˴���
				else if(type == CharacterUtil.CLOSE_CLIENT_WINDOW_CONFIRMATION)
				{
					try
					{
						this.getSocket().getInputStream().close();
						this.getSocket().getOutputStream().close();
						this.getSocket().close();
					}
					catch(Exception ex)
					{
						
					}
					finally
					{
						System.exit(0);//�˳��ͻ��˳���
					}
				}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}	
