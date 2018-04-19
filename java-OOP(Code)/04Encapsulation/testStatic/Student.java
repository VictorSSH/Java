package cn.bdqn.testStatic;

/**
 *   һ�����ڱ�jvm���ص�ʱ�����Ȼ��������������static���εķ��������ԣ�����飡
 *   ����������ݷŽ����еľ�̬�洢�����������Ƿ��ʣ�
 * 
 * static �������ε�����
 * 01.����       ��̬����
 * 02.����       ��̬����
 * 03.�����   ��̬�����
 * 
 * 
 * �ص㣺
 *    01. ��static���ε����ݣ����������������ڼ䣬ֻ����һ�ݣ�
 *    02. ��static���ε����Ժͷ�����ֱ�ӿ���ͨ������.���� /����.����
 *    03. static���εķ����� ���ܷ��� ��static���εĵ����ԣ�
 *    04.��static���εķ������ܷ��� static���εĵ����ԣ�
 *    
 *    
 *  ���ӣ�
 *  ֮ǰ˵�� һ������Դ���N������
 *  ÿ�������Ƕ�һ�޶��ģ�
 *  
 *    ���� ����ʵ��N������ ����һ�����ԣ�
 * 
 */
public class Student {

	static int age; // ��̬����
	String name;

	/**
	 *  ����һ��static���εľ�̬����
	 *  ֮ǰ�ķ�ʽ��
	 *    01.ͨ���ഴ������
	 *    02.ͨ������.��������
	 *    
	 *    ����
	 *    ֱ��ͨ������.����
	 */

	public static void sayHello() {
		System.out.println("����һ����̬����");
	}

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.age = 50;
		stu1.name = "С��";
		Student stu2 = new Student();
		stu2.age = 30;
		stu2.name = "С��";

		System.out.println("stu1�����䣺" + stu1.age);
		System.out.println("stu2�����䣺" + stu2.age);
		System.out.println("stu1��������" + stu1.name);
		System.out.println("stu2��������" + stu2.name);

		/**
		 *  �� ageǰ ��һ�����η� static
		 *  ��Ȼû�и�stu3�����age���Ը�ֵ��
		 *  ������Ϊage��static���εģ�
		 *  �������ж�����������ԣ�
		 *  ֻҪ��һ������ı������age���ԣ�
		 *  ��ô���ж�������age���Զ���֮�����仯��
		 */
		Student stu3 = new Student();
		stu3.age = 60;
		System.out.println("stu3�����䣺" + stu3.age);

		Student.sayHello();

	}

}
