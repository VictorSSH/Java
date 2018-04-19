package cn.bdqn.params;

/**
 * 学生类   
 */
public class Student {

	int age; // 年龄
	String name; // 姓名

	/**
	 * shift +alt  +s  +o  快捷键 生成 有参和无参构造
	 */
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public Student() {
		super();
	}

	/**
	 * 学生自我介绍的方法
	 */
	public void showInfo() {
		System.out.println("我的姓名是：" + name);
		System.out.println("我的年龄是：" + age);
	}

	public void showInfo(Student stu) {
		stu.age = 888; // 改变参数的值
		stu.name = "小白";
		System.out.println("参数的姓名是：" + stu.name);
		System.out.println("参数的年龄是：" + stu.age);
	}

	/**
	 * 学生睡觉的方法
	 */
	public void sleep() {
		System.out.println(name + "在睡觉");
	}

	/**
	 * @param stu  用户传递来的学生对象
	 * @return    是否长大了
	 */
	public void changeStudent(Student stu) {
		// 定义一个标记
		boolean flag = false;
		if (stu.age > 20) {
			flag = true;
		}

		if (flag) {
			System.out.println("你已经长大了！");
		} else {
			System.out.println("你还年轻！");
		}

	}

}
