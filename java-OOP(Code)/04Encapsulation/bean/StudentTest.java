package cn.bdqn.bean;

public class StudentTest {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.setSex('c'); // ͨ��set()���Ը�ֵ
		// ͨ��get()ȡֵ
		System.out.println(stu.getSex());
	}
}
