package cn.bdqn.bean;

public class Bird extends Animal implements FlyInterface {

	@Override
	public void eat() {
		System.out.println("小鸟在吃虫子！");
	}

	@Override
	public void fly() {
		System.out.println("小鸟在飞翔.......");
	}
}
