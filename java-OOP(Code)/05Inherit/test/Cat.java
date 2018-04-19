package cn.bdqn.test;

/**
 * 小猫类
 */
public class Cat extends Animal {
	private String name; // 小猫特有的！！！！

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 小猫吃鱼的方法
	 */
	@Override
	public void eat() {
		System.out.println("小猫吃鱼的方法");
	}

	/**
	 * 验证方法的返回值是父类也可以是子类
	 */
	@Override
	public Cat saleAnimal() {
		return new Cat();
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + "age=" + super.getAge() + "]";
	}

}
