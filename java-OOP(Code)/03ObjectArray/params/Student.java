package cn.bdqn.params;

/**
 * ѧ����   
 */
public class Student {

	int age; // ����
	String name; // ����

	/**
	 * shift +alt  +s  +o  ��ݼ� ���� �вκ��޲ι���
	 */
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public Student() {
		super();
	}

	/**
	 * ѧ�����ҽ��ܵķ���
	 */
	public void showInfo() {
		System.out.println("�ҵ������ǣ�" + name);
		System.out.println("�ҵ������ǣ�" + age);
	}

	public void showInfo(Student stu) {
		stu.age = 888; // �ı������ֵ
		stu.name = "С��";
		System.out.println("�����������ǣ�" + stu.name);
		System.out.println("�����������ǣ�" + stu.age);
	}

	/**
	 * ѧ��˯���ķ���
	 */
	public void sleep() {
		System.out.println(name + "��˯��");
	}

	/**
	 * @param stu  �û���������ѧ������
	 * @return    �Ƿ񳤴���
	 */
	public void changeStudent(Student stu) {
		// ����һ�����
		boolean flag = false;
		if (stu.age > 20) {
			flag = true;
		}

		if (flag) {
			System.out.println("���Ѿ������ˣ�");
		} else {
			System.out.println("�㻹���ᣡ");
		}

	}

}
