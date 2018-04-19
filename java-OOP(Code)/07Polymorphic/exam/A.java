package cn.bdqn.exam;

public class A {
	/**
	 * 下面两个方法是重载
	 */
	public String show(D d) {
		return " A   AND  D";
	}

	public String show(A a) {
		return " A   AND  A";
	}

}
