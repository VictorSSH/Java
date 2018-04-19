package cn.bdqn.bean;

public class StudentTest {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.setSex('c'); // 通过set()属性赋值
		// 通过get()取值
		System.out.println(stu.getSex());
	}
}
