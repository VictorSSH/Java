package cn.bdqn.bean;

/*
 * 动物类
 */
public abstract class Animal {

	public abstract void eat();

	/**
	 * 因为 不是所有的动物都会飞行！
	 * 所以这个fly（）压根 就不能定义在animal类中
	 */
	// public abstract void fly();

}
