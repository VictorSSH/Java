package cn.bdqn.demo;

/**
 * 顾客类
 */
public class Customer {
	/**
	 * 定义属性
	 */
	int ponits; // 积分
	String cardType; // 卡类型

	/**
	 * 显示卡和积分的方法
	 */
	public void showInfo() {
		System.out.println("卡类型:" + cardType + ",积分" + ponits);
	}
}
