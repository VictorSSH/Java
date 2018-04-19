package com.shengsiyuan.jdk5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericTest<T>
{
	private T foo;

	public T getFoo()
	{
		return foo;
	}

	public void setFoo(T foo)
	{
		this.foo = foo;
	}
	
	public static void main(String[] args)
	{
		GenericTest<? extends List> ge = null;
		
		ge = new GenericTest<ArrayList>();
		ge = new GenericTest<LinkedList>();
		
		//ge = new GenericTest<HashMap>();
		
		GenericTest<? super List> ge2 = null;
		
		ge2 = new GenericTest<Object>();
		
		GenericTest<String> ge3 = new GenericTest<String>();
		ge3.setFoo("hello world");
		
		GenericTest<?> ge4 = ge3;
		
		System.out.println(ge4.getFoo());
		
		ge4.setFoo(null);
		
		System.out.println(ge4.getFoo());
		
		//ge4.setFoo("welcome");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
