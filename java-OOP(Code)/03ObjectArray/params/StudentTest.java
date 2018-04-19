package cn.bdqn.params;

public class StudentTest {
	public static void main(String[] args) {
		// 创建学生类对象
		Student stu = new Student();
		stu.age = 20;
		stu.name = "小黑";
		// 自我介绍
		stu.showInfo();
		// 调用对象的睡觉方法
		stu.sleep();
		System.out.println("----------------------------");
		stu.showInfo(stu);
		// 调用学生是否长大的方法
		stu.changeStudent(stu);
	}

}
