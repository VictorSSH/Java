package com.shengsiyuan.decorator;

public class Client
{
	public static void main(String[] args)
	{
		/*
		 * //�ڵ��� Component component = new ConcreteComponent();
		 * 
		 * //������ Component component2 = new ConcreteDecorator1(component);
		 * 
		 * component2.doSomething();
		 * 
		 * System.out.println("------------");
		 * 
		 * //������ Component component3 = new ConcreteDecorator2(component2);
		 * 
		 * component3.doSomething();
		 */

		Component component = new ConcreteDecorator1(new ConcreteDecorator2(
				new ConcreteComponent()));

		component.doSomething();
	}
}
