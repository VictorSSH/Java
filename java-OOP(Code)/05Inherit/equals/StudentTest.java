package cn.bdqn.equals;

public class StudentTest {

	/**
	 * ������������   ==�Ƚϵ���ֵ��
	 * ������������   ==�Ƚϵ����ڴ��ַ�� 
	 */
	public static void main(String[] args) {
		Student stu1 = new Student(25, "С��");
		Student stu2 = new Student(25, "С��");
		System.out.println(stu1 == stu2);
		/**
		 * equals��object����  ִ�еľ��� == �Ƚϵ����ڴ��ַ!
		 */
		System.out.println(stu1.equals(stu2));

	}

}
