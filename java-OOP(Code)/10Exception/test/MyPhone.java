package cn.bdqn.test;

public class MyPhone implements PhoneInterface {

	@Override
	public void call() throws Exception {
		System.out.println("正在打电话");
		System.out.println("电话欠费了");
		throw new Exception();

	}

}
