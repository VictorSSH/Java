package cn.bdqn.test;

public class MyPhone implements PhoneInterface {

	@Override
	public void call() throws Exception {
		System.out.println("���ڴ�绰");
		System.out.println("�绰Ƿ����");
		throw new Exception();

	}

}
