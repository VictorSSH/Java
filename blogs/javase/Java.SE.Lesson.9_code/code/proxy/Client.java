package com.shengsiyuan.proxy;

public class Client
{
	public static void main(String[] args)
	{
		Subject subject = new ProxySubject();
		
		subject.request();
	}
}
