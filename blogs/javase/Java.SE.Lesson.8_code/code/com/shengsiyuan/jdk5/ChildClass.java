package com.shengsiyuan.jdk5;

public class ChildClass<T1, T2> implements ParentInterface<T1, T2>
{
	private T1 foo1;

	private T2 foo2;

	public void setFoo1(T1 foo1)
	{
		this.foo1 = foo1;
	}

	public void setFoo2(T2 foo2)
	{
		this.foo2 = foo2;
	}

	public T1 getFoo1()
	{
		return this.foo1;
	}

	public T2 getFoo2()
	{
		return this.foo2;
	}
}
