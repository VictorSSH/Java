package com.shengsiyuan.jdk5;

public class Child<T1, T2, T3> extends Parent<T1, T2>
{
	private T3 foo3;

	public T3 getFoo3()
	{
		return foo3;
	}

	public void setFoo3(T3 foo3)
	{
		this.foo3 = foo3;
	}
}
