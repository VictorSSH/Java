package com.shengsiyuan.exception;

public class ExceptionTest5
{
	public void method() 
	{
		try
		{
			System.out.println("���뵽try��");
			
			System.exit(0);
		}
		catch(Exception ex)
		{
			System.out.println("�쳣������");
		}
		finally
		{
			System.out.println("���뵽finally��");
		}
		
		System.out.println("�쳣��������Ĵ���");
	}
	
	public static void main(String[] args)
	{
		ExceptionTest5 test = new ExceptionTest5();
		
		test.method();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
