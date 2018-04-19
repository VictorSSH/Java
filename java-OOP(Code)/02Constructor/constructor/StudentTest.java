package cn.bdqn.constructor;

public class StudentTest {

	public static void main(String[] args) {
		/**
		 *  通过Student类来创建我们一个学生对象
		 *  Student() 无参构造方法
		 */
		Student stu = new Student();
		stu.name = "aa";
		stu.age = 20;
		System.out.println(stu.name); // 出生的娃娃没有起名
		System.out.println(stu.age);

		System.out.println("------------------------------------------");
		// 再次创建一个学生对象 调用 带参构造方法
		Student stu2 = new Student(25, "小黑");
		System.out.println(stu2.name); // 出生的娃娃有名字
		System.out.println(stu2.age);
	}

}
