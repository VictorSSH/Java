package cn.bdqn.bean;

import cn.bdqn.bean.Father.Son2;

public class InnerClassTest {

	public static void main(String[] args) {
		// 使用内部类？？？
		// 01.实例化外部类对象
		Father father = new Father();
		// 02.通过外部类对象创建内部类对象
		Father.Son son = father.new Son();
		// 03.调用内部类的方法
		son.sayHello();

		// 使用局部内部类
		father.getSon();

		// 使用静态内部类
		Son2 son2 = new Son2();
		son2.sayBye();

	}

	// 当我们所在方法的形参需要在内部类中使用的时候，这个形参必须是final 修饰的！

	class Son {

		public void eatSomething(String something, final int age) {
			// 使用匿名内部类
			Animal dog = new Animal() {
				@Override
				public void sleep() {
					System.out.println("小狗在睡觉");
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
