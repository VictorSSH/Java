package cn.bdqn.testexception;

/**
 * �Զ����쳣��
 */
public class MyException extends Exception {
	public MyException() {
		super("�����쳣");// ���� ��Exception���еĴ��͹���
	}

	public static void main(String[] args) {

		System.out.println("��������������");
		try {
			throw new MyException();
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

	}
}
