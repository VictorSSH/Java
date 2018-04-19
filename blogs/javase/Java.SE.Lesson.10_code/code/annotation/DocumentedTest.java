package com.shengsiyuan.annotation;

public class DocumentedTest
{
	@DocumentedAnnotation(hello = "welcome")
	public void method()
	{
		System.out.println("hello world");
	}
}
