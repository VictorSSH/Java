package cn.bdqn.constructor;

public class StudentTest {

	public static void main(String[] args) {
		/**
		 *  ͨ��Student������������һ��ѧ������
		 *  Student() �޲ι��췽��
		 */
		Student stu = new Student();
		stu.name = "aa";
		stu.age = 20;
		System.out.println(stu.name); // ����������û������
		System.out.println(stu.age);

		System.out.println("------------------------------------------");
		// �ٴδ���һ��ѧ������ ���� ���ι��췽��
		Student stu2 = new Student(25, "С��");
		System.out.println(stu2.name); // ����������������
		System.out.println(stu2.age);
	}

}
