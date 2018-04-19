package cn.bdqn.testThis;

/**
 * 书写实体类的步骤
 * 01.定义属性
 * 02.快捷键生成set  get
 * 03.快捷键生成  有参 无参构造
 * 04.生成toString()
 */
public class Student {
	private int age;
	private String name; // 属性

	/**
	 * set和get方法名称后的第一个单词 首字母小写 ===》属性名
	 * 
	 * 01.this调用本类的构造方法时，只能存在构造方法中的第一行！
	 * 02.this还可以访问我们的属性和方法 可以存在任何位置！
	 */
	public Student() {
		this(50, "小黑"); // 调用本类的带参构造
	}

	public Student(int age, String name) {
		// this(); 调用本类的无参构造
		this.age = age;
		this.name = name;
	}

	// set get方法
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

}
