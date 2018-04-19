package cn.bdqn.test;

import java.util.Scanner;

/**
 *ѧ����
 */
public class Student {
	// ����һ���������鱣��3��ѧ������Ϣ
	Student[] stus = new Student[3];

	int age; // ����
	String name; // ����

	/**
	 *  �޲ι���
	 */
	public Student() {
	}

	/**
	 * ���ι���
	 */
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	/**
	 * ѭ�������������е�ÿһ��Ԫ�� ��ֵ
	 * @param stus  �û����ݹ����Ķ�������
	 */
	public void addStudent() {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < stus.length; i++) {
			System.out.println("��������" + (i + 1) + "��ѧ����ֵ��");
			// ��Ҫ�������е�ÿһ��Ԫ�ض��� ʵ����
			stus[i] = new Student();
			System.out.println("������");
			stus[i].name = input.next();
			System.out.println("���䣺");
			stus[i].age = input.nextInt();
		}

	}

	/**
	 * @param students  ��Ҫ��������������
	 */
	public void showStudent() {
		System.out.println("���е�ѧ����Ϣ��ʾ���£�");
		for (Student stu : stus) {
			System.out.println(stu.name + ":" + stu.age);
		}
	}

	/**
	 * ��ѯѧ��
	 */
	public void finStudent(int begin, int end, String name) {
		// ����һ�����
		boolean flag = false;
		for (int i = begin - 1; i < end; i++) {
			if (stus[i].name.equals(name)) {
				flag = true; // �ҵ��� Ϊtrue
				break;
			}
		}
		if (flag) {
			System.out.println("�ҵ���");
		} else {
			System.out.println("����ѯ��ѧ�������ڣ�");
		}
	}

	/**
	 * @param oldName   ѧ����ǰ������
	 * @param newName   ����֮�������
	 */
	public void changeName(String oldName, String newName) {
		// ����һ����� ���Ƿ���ĳɹ�
		boolean flag = false;
		for (int i = 0; i < stus.length; i++) {
			if (stus[i].name.equals(oldName)) {
				stus[i].name = newName;
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("�޸ĳɹ�");
		} else {
			System.out.println("û���ҵ����޷��޸�");
		}
	}

}
