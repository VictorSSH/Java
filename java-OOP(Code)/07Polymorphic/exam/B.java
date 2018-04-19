package cn.bdqn.exam;

public class B extends A {

	/**
	 * 下面两个方法是重载
	 */
	public String show(B b) {
		return " B   AND  B";
	}

	/**
	 *重写A类的方法
	 */
	public String show(A a) {
		return " B   AND  A";
	}

}
