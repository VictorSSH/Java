package cn.bdqn.test;

import java.util.Scanner;

/**
 *学生类
 */
public class Student {
	// 创建一个对象数组保存3名学生的信息
	Student[] stus = new Student[3];

	int age; // 年龄
	String name; // 姓名

	/**
	 *  无参构造
	 */
	public Student() {
	}

	/**
	 * 带参构造
	 */
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	/**
	 * 循环给对象数组中的每一个元素 赋值
	 * @param stus  用户传递过来的对象数组
	 */
	public void addStudent() {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < stus.length; i++) {
			System.out.println("请您给第" + (i + 1) + "个学生赋值：");
			// 需要给数组中的每一个元素对象 实例化
			stus[i] = new Student();
			System.out.println("姓名：");
			stus[i].name = input.next();
			System.out.println("年龄：");
			stus[i].age = input.nextInt();
		}

	}

	/**
	 * @param students  需要遍历的数组名称
	 */
	public void showStudent() {
		System.out.println("所有的学生信息显示如下：");
		for (Student stu : stus) {
			System.out.println(stu.name + ":" + stu.age);
		}
	}

	/**
	 * 查询学生
	 */
	public void finStudent(int begin, int end, String name) {
		// 定义一个标记
		boolean flag = false;
		for (int i = begin - 1; i < end; i++) {
			if (stus[i].name.equals(name)) {
				flag = true; // 找到了 为true
				break;
			}
		}
		if (flag) {
			System.out.println("找到了");
		} else {
			System.out.println("您查询的学生不存在！");
		}
	}

	/**
	 * @param oldName   学生以前的姓名
	 * @param newName   更改之后的姓名
	 */
	public void changeName(String oldName, String newName) {
		// 定义一个标记 看是否更改成功
		boolean flag = false;
		for (int i = 0; i < stus.length; i++) {
			if (stus[i].name.equals(oldName)) {
				stus[i].name = newName;
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("修改成功");
		} else {
			System.out.println("没有找到！无法修改");
		}
	}

}
