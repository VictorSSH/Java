package com.shengsiyuan.chat.server;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

import com.shengsiyuan.chat.util.XMLUtil;

public class ServerConnection extends Thread
{
	private ServerSocket serverSocket;
	
	private Server server;
	
	public ServerConnection(Server server, int port)
	{
		try
		{
			this.server = server;
			
			this.serverSocket = new ServerSocket(port);
			
			// �������д��벻�ܷŵ�����һ�д���֮ǰ
			// ��Ϊ����������ʱ�п��ܻ��׳��쳣
			// ����������棬�����쳣ʱҲ�ᵼ��label�ϵ��ı������仯
			// ����ʵ���������
			this.server.getJLabel2().setText("����");
			this.server.getJButton().setEnabled(false);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			
			JOptionPane.showMessageDialog(this.server, "�˿ںű�ռ�ã�", "����", JOptionPane.ERROR_MESSAGE);
		}
	}

	@Override
	public void run()
	{
		while(true)
		{
			try
			{
				Socket socket = this.serverSocket.accept();
				
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				
				byte[] buf = new byte[5000];
				int length = is.read(buf);
				
				//�ͻ��˷�����������Ϣ���������û�����
				String loginXML = new String(buf, 0, length); 
				
				// �ӿͻ��˵�¼��������ȡ���û�����Ϣ��username��
				String username = XMLUtil.extractUsername(loginXML); 
				
				String loginResult = null;
				
				// �ж��û��Ƿ��¼�ɹ�
				boolean isLogin = false;
				
				// �ж��û����Ƿ��ظ�
				// �û����ظ�
				if(this.server.getMap().containsKey(username))
				{
					loginResult = "failure";
				}
				// �û������ظ�
				else
				{
					loginResult = "success";
					
					isLogin = true;
				}
				
				String xml = XMLUtil.constructLoginResultXML(loginResult);
				
				os.write(xml.getBytes());
				
				// ����û���¼�ɹ��������߳�
				if(isLogin)
				{
					// ׼�������µ��̣߳����ڴ����û����������ݣ�ÿһ�������ϵ��û������Ӧһ�����߳�
					ServerMessageThread serverMessageThread = new ServerMessageThread(this.server, socket);
					//���û�������֮��Ӧ���̶߳��� �ŵ�Map��
					this.server.getMap().put(username, serverMessageThread);
					
					//�����û��б���������+�ͻ��ˣ�
					serverMessageThread.updateUserList();
					
					serverMessageThread.start();
				}				
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
