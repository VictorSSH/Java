package cn.bdqn.bean;

/**
 * Student  学生类
 *  
 */
public class Student {
	/**
	 * 所有学生 共有的属性（特征）
	 * 全局变量 有默认值
	 */
	int age;
	String name;
	char sex;

	/**
	 * 所有学生 共有的方法 （行为）
	 */
	public void eat() {
		System.out.println(name + "在吃饭");
	}

	/**
	 * 自我介绍的方法
	 */
	public void showInfo() {
		System.out.println("姓名是：" + name);
		System.out.println("年龄是：" + age);
		System.out.println("性别是：" + sex);
	}

}
