package cn.bdqn.test;

public class ThrowsAndThrow {

	/**
	 * 遇到throw new Exception();解决方式
	 *  01.自己处理 使用try catch
	 *  02.谁有谁处理  使用throws 
	 *     别人使用的时候，给别人说有什么问题！！
	 *  03.throws的异常必须大于或者等于抛出的异常！
	 * @throws Exception 
	 */
	public void sayHello() throws Exception {
		System.out.println("执行了sayHello");
		throw new Exception();// 抛出异常
	}
}
