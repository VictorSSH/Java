package cn.bdqn.bean;

import cn.bdqn.bean.Father.Son2;

public class InnerClassTest {

	public static void main(String[] args) {
		// ʹ���ڲ��ࣿ����
		// 01.ʵ�����ⲿ�����
		Father father = new Father();
		// 02.ͨ���ⲿ����󴴽��ڲ������
		Father.Son son = father.new Son();
		// 03.�����ڲ���ķ���
		son.sayHello();

		// ʹ�þֲ��ڲ���
		father.getSon();

		// ʹ�þ�̬�ڲ���
		Son2 son2 = new Son2();
		son2.sayBye();

	}

	// ���������ڷ������β���Ҫ���ڲ�����ʹ�õ�ʱ������βα�����final ���εģ�

	class Son {

		public void eatSomething(String something, final int age) {
			// ʹ�������ڲ���
			Animal dog = new Animal() {
				@Override
				public void sleep() {
					System.out.println("С����˯��");
				}

				@Override
				public void eat() {
					System.out.println(age);
				}
			};
			dog.eat();
			dog.sleep();

		}

	}

}
