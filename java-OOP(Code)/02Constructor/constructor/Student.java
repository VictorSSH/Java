package cn.bdqn.constructor;

/**
 * 学生类
 * ctrl+o  查询本类的所有属性 和方法
 */
public class Student {
	int age; // 年龄
	String name; // 姓名

	// 自己创建一个本类的 无参 构造方法
	public Student() {
	}

	/**
	 *  创建一个本类的 带参 构造方法
	 * @param name   用户传递过来的  姓名
	 * @param age    用户传递过来的  年龄
	 * 
	 * name 和age  都是我们Student带参构造中的 形参 ！ 也是 局部变量！
	 *  形参和 成员变量 同名了？？？
	 *  取谁？实际用的是哪个变量？
	 *  怎么解决这个同名的问题呢？？
	 *  使用关键字 this ==>当前类的对象
	 */
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

}
