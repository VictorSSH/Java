package cn.bdqn.bean;

/**
 * 飞行的接口！
 *  小鸟  飞机 以及 子弹  飞行的方式 一样吗？？  不一样！！
 *  所以说 这个fly（）有必要写方法体吗？？   没必要！！
 *  说明这个fly（）就是一个抽象方法！
 *  
 *  
 * 
 */
public interface FlyInterface {

	/**
	 * 静态常量
	 */
	static final int NUM = 5;

	/**
	 * 飞行的能力
	 */
	public abstract void fly();

}
