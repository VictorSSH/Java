package cn.bdqn.test;

public class ThrowsAndThrow {

	/**
	 * ����throw new Exception();�����ʽ
	 *  01.�Լ����� ʹ��try catch
	 *  02.˭��˭����  ʹ��throws 
	 *     ����ʹ�õ�ʱ�򣬸�����˵��ʲô���⣡��
	 *  03.throws���쳣������ڻ��ߵ����׳����쳣��
	 * @throws Exception 
	 */
	public void sayHello() throws Exception {
		System.out.println("ִ����sayHello");
		throw new Exception();// �׳��쳣
	}
}
