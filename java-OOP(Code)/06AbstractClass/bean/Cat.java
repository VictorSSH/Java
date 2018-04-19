package cn.bdqn.bean;

/**
 * 因为cat不是抽象类，所以必须实现父类中所有的抽象方法
 */
public class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("小猫咪在吃鱼！");
	}

}
