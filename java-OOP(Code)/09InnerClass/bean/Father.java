package cn.bdqn.bean;

public class Father { // �ⲿ��
	/**
	 * �ⲿ��ĳ�Ա����
	 */
	private static int age = 5;
	private String name = "С��";

	class Son { // ��Ա�ڲ���
		int age = 50;
		String name = "С��";

		/**
		 * �ڲ�����к��ķ���
		 */
		public void sayHello() {
			System.out.println("�ⲿ���������" + Father.this.name);
		}
	}

	/**
	 * �ⲿ��ķ���
	 */
	public void getSon() {
		class Son { // �ֲ��ڲ��� ֻ����getSon������ʹ��
			public void sayBye() {
				System.out.println("�ֲ��ڲ��� bye ");
			}
		}
		Son son = new Son(); // �����ڷ�������ʹ��
		son.sayBye();
	}

	static class Son2 { // ��̬�ڲ���
		public void sayBye() {
			System.out.println("��̬�ڲ���====�� bye " + age);
		}
	}

}
