package com.shengsiyuan.decorator;

public class ConcreteDecorator2 extends Decorator
{
	public ConcreteDecorator2(Component component)
	{
		super(component);
	}
	
	@Override
	public void doSomething()
	{
		super.doSomething();
		
		this.doAnotherThing();
	}
	
	private void doAnotherThing()
	{
		System.out.println("����C");
	}
}
