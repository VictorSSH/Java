package cn.bdqn.method;

public class StudentTest {

	public static void main(String[] args) {

		// 创建一个学生对象
		Student stu = new Student("小红");
		String result = stu.buy(500, "小白");
		System.out.println(result);

	}

}
