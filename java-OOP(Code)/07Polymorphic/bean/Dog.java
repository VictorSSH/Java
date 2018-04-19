package cn.bdqn.bean;

public class Dog extends Animal {

	@Override
	public void eat() {
		System.out.println("小狗狗在啃骨头");
	}

	/**
	 * 小狗狗特有的游泳的方法
	 */
	public void swimming() {
		System.out.println("小狗狗在游泳");
	}

}
