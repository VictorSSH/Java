package cn.bdqn.bean;

/**
 * Student  ѧ����
 *  
 */
public class Student {
	/**
	 * ����ѧ�� ���е����ԣ�������
	 * ȫ�ֱ��� ��Ĭ��ֵ
	 */
	int age;
	String name;
	char sex;

	/**
	 * ����ѧ�� ���еķ��� ����Ϊ��
	 */
	public void eat() {
		System.out.println(name + "�ڳԷ�");
	}

	/**
	 * ���ҽ��ܵķ���
	 */
	public void showInfo() {
		System.out.println("�����ǣ�" + name);
		System.out.println("�����ǣ�" + age);
		System.out.println("�Ա��ǣ�" + sex);
	}

}
