package cn.bdqn.bean;

public class Bird extends Animal implements FlyInterface {

	@Override
	public void eat() {
		System.out.println("С���ڳԳ��ӣ�");
	}

	@Override
	public void fly() {
		System.out.println("С���ڷ���.......");
	}
}
