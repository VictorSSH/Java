package cn.bdqn.bean;

/**
 * 学生类
 * 
 * 面向对象的三大特性！
 * 01.封装
 *     概念：将类的某些信息隐藏在类内部！不允许其他类直接访问，而是通过该类提供的方法来访问隐藏的信息！
 *     目的：隐藏类的内部细节！ 安全！
 *   
 *   步骤：
 *     001.把所有的属性 私有化
 *     002.创建属性对应的set和get方法     shift +alt +s  +r 快速生成类中所有变量的set和get方法
 *     003.在对应的set或者get方法中 增加逻辑判断！确保数据的有效性！
 * 
 * 
 * 02.继承
 * 03.多态
 * 
 */
public class Student {
	private int age; // 年龄
	private String name; // 姓名
	private char sex; // 性别

	/**
	 * get() 是为了别人获取值
	 * set() 是为了给属性赋值
	 * shift +alt +s  +r 快速生成类中所有变量的set和get方法
	 * 
	 */
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	/**
	 * @param sex  用户传递来的 用户性别
	 * 如果用户输入的是不健康的数据！
	 * 我们默认sex='男'
	 */
	public void setSex(char sex) {
		if (sex == '男' || sex == '女') {
			this.sex = sex;
		} else {
			// 不健康输入
			this.sex = '男';
		}
	}

}
