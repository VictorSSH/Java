package cn.bdqn.bean;

/**
 * Student 和 Teacher类的父类
 * 
 * 
 * 我们把两个子类中共有的属性和方法提取到父类中！
 * 
 */
public class Person {
	private int age; // 年龄
	private String name; // 姓名
	private String address; // 地址

	/**
	 * shift + alt +s +r  生成本类所有属性的set()和get
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @Override 重写父类的方法
	 */
	@Override
	public String toString() {
		return "age:" + this.age + "name：" + this.name + "address："
				+ this.address;
	}
}
