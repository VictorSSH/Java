package cn.bdqn.bean;

public class StudentTest {

	public static void main(String[] args) {
		/**
		 *  01.��������
		 *  ����  ������=new ����();
		 *  02.���ö�������Ժͷ���
		 *  ������.����;
		 *  ������.����();
		 */
		Student stu1 = new Student();// 01.��������
		// 02.���ö��������
		stu1.name = "����";
		stu1.age = 18;
		stu1.sex = '��';
		// 03.���ö���ķ���
		stu1.showInfo();

		System.out.println("==================================");
		Student stu2 = new Student();
		stu2.name = "С��";
		stu2.age = 28;
		stu2.sex = 'Ů';
		stu2.showInfo();

		System.out.println(stu1 == stu2); // ÿ�������Ƕ�һ�޶��� false
	}
}
