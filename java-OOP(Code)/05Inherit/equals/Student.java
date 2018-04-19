package cn.bdqn.equals;

public class Student {

	private int age;
	private String name;

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

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public Student() {
		super();
	}

	/**
	 * 重写Object类的方法
	 */
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	/**
	 * 重写Object类中的equals
	 * @param  obj   就是用户需要比较内容的对象
	 */
	@Override
	public boolean equals(Object obj) {
		// 01.先判断内存地址是否一致
		if (this == obj) {
			return true;
		}
		// 02.判断obj的类型
		if (!(obj instanceof Student)) { // 说明obj根本不是Student类型
			return false;
		}
		// 03.向下转型
		Student stu = (Student) obj;
		// 04.开始判断两个对象的属性值是否一致
		if (stu.getAge() == this.age && stu.getName().equals(this.name)) {
			return true;
		}

		return false;
	}
}
