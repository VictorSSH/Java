package cn.bdqn.test;

import java.util.Scanner;

public class StudentTest {

	/**
	 * 需求：
	 * 01.现在有3名学生！创建一个对象数组保存这3名学生的信息！并且输出！
	 * 02.让用户输入一个开始和结束位置！以及学生的姓名！ 我们判断是否有该学生！
	 * 
	 * 
	 * 分析：
	 * 01.3名学生，每一个学生都是一个对象！那么第一步创建一个学生类！！！
	 *   并且 给类中增加属性和构造方法
	 * 02.什么是数组？  一组相同数据类型的数据集合！
	 *     int []  nums=new int[3];
	 *     
	 *    什么是对象数组？
	 *    3名学生 是3个对象！  类型一样，类型都是Student类型！
	 *      Student   []  students=new   Student[3];
	 *   现在students数组中的每一个元素 是什么？
	 *    students[0]  是一个Student对象！
	 *    students[1]  是一个Student对象！
	 *    students[2]  是一个Student对象！
	 *  03.怎么给对象数组中的每一个元素（Student对象）的属性赋值呢？
	 *       前提  每一个元素 都需要实例化！
	 *       因为这个对象数组中的每一个元素 不再是普通的数值了，而是一个Student类型的对象！
	 *       对象没有实例化，是不能使用的！
	 *       否则会产生NullPointerException（空指针异常）
	 *       null.不出来任何东西！
	 */
	public static void main(String[] args) {

		// 实例化Student类
		Student stu = new Student();
		stu.addStudent(); // 循环新增学生信息
		// 看到输入的所有 学生信息
		stu.showStudent();
		// 根据开始和结束位置，去数组中查询 有没有该学生
		Scanner input = new Scanner(System.in);
		System.out.println("请输入开始查询的位置：");
		int begin = input.nextInt();
		System.out.println("请输入结束查询的位置：");
		int end = input.nextInt();
		System.out.println("请输入查询的学生姓名：");
		String name = input.next();
		// 根据用户的输入找到指定的学生
		stu.finStudent(begin, end, name);

		System.out.println("请输入需要修改的学生姓名：");
		String oldName = input.next();
		System.out.println("请输入新姓名：");
		String newName = input.next();
		stu.changeName(oldName, newName);
		// 看到输入的所有 学生信息
		stu.showStudent();

	}

}
