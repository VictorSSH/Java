package cn.bdqn.testexception;

/**
 * 自定义异常类
 */
public class MyException extends Exception {
	public MyException() {
		super("年龄异常");// 调用 了Exception类中的代餐构造
	}

	public static void main(String[] args) {

		System.out.println("请输入您的年龄");
		try {
			throw new MyException();
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

	}
}
