package cn.bdqn.test;

import java.util.Scanner;

public class StudentTest {

	/**
	 * ����
	 * 01.������3��ѧ��������һ���������鱣����3��ѧ������Ϣ�����������
	 * 02.���û�����һ����ʼ�ͽ���λ�ã��Լ�ѧ���������� �����ж��Ƿ��и�ѧ����
	 * 
	 * 
	 * ������
	 * 01.3��ѧ����ÿһ��ѧ������һ��������ô��һ������һ��ѧ���࣡����
	 *   ���� �������������Ժ͹��췽��
	 * 02.ʲô�����飿  һ����ͬ�������͵����ݼ��ϣ�
	 *     int []  nums=new int[3];
	 *     
	 *    ʲô�Ƕ������飿
	 *    3��ѧ�� ��3������  ����һ�������Ͷ���Student���ͣ�
	 *      Student   []  students=new   Student[3];
	 *   ����students�����е�ÿһ��Ԫ�� ��ʲô��
	 *    students[0]  ��һ��Student����
	 *    students[1]  ��һ��Student����
	 *    students[2]  ��һ��Student����
	 *  03.��ô�����������е�ÿһ��Ԫ�أ�Student���󣩵����Ը�ֵ�أ�
	 *       ǰ��  ÿһ��Ԫ�� ����Ҫʵ������
	 *       ��Ϊ������������е�ÿһ��Ԫ�� ��������ͨ����ֵ�ˣ�����һ��Student���͵Ķ���
	 *       ����û��ʵ�������ǲ���ʹ�õģ�
	 *       ��������NullPointerException����ָ���쳣��
	 *       null.�������κζ�����
	 */
	public static void main(String[] args) {

		// ʵ����Student��
		Student stu = new Student();
		stu.addStudent(); // ѭ������ѧ����Ϣ
		// ������������� ѧ����Ϣ
		stu.showStudent();
		// ���ݿ�ʼ�ͽ���λ�ã�ȥ�����в�ѯ ��û�и�ѧ��
		Scanner input = new Scanner(System.in);
		System.out.println("�����뿪ʼ��ѯ��λ�ã�");
		int begin = input.nextInt();
		System.out.println("�����������ѯ��λ�ã�");
		int end = input.nextInt();
		System.out.println("�������ѯ��ѧ��������");
		String name = input.next();
		// �����û��������ҵ�ָ����ѧ��
		stu.finStudent(begin, end, name);

		System.out.println("��������Ҫ�޸ĵ�ѧ��������");
		String oldName = input.next();
		System.out.println("��������������");
		String newName = input.next();
		stu.changeName(oldName, newName);
		// ������������� ѧ����Ϣ
		stu.showStudent();

	}

}
