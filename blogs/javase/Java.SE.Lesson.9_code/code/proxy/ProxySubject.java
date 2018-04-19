package com.shengsiyuan.proxy;

public class ProxySubject extends Subject
{
	private RealSubject realSubject; //�����ɫ�ڲ���������ʵ��ɫ
	
	public void request()
	{
		this.preRequest(); //����ʵ��ɫ����֮ǰ�����ӵĲ���
		
		if(null == realSubject)
		{
			realSubject = new RealSubject();
		}
		
		realSubject.request(); //��ʵ��ɫ����ɵ�����
		
		this.postRequest(); //����ʵ��ɫ����֮�������ӵĲ���
	}
	
	private void preRequest()
	{
		System.out.println("pre request");
	}
	
	private void postRequest()
	{
		System.out.println("post request");
	}
}
