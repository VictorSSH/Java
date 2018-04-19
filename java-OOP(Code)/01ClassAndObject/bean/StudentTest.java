package cn.bdqn.bean;

public class StudentTest {

	public static void main(String[] args) {
		/**
		 *  01.创建对象
		 *  类名  对象名=new 类名();
		 *  02.调用对象的属性和方法
		 *  对象名.属性;
		 *  对象名.方法();
		 */
		Student stu1 = new Student();// 01.创建对象
		// 02.调用对象的属性
		stu1.name = "张三";
		stu1.age = 18;
		stu1.sex = '男';
		// 03.调用对象的方法
		stu1.showInfo();

		System.out.println("==================================");
		Student stu2 = new Student();
		stu2.name = "小芳";
		stu2.age = 28;
		stu2.sex = '女';
		stu2.showInfo();

		System.out.println(stu1 == stu2); // 每个对象都是独一无二的 false
	}
}
