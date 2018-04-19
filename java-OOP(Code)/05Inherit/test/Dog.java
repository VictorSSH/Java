package cn.bdqn.test;

/**
 * 小狗类
 */
public class Dog extends Animal {
	private String strain;// 小狗特有的！！！！

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	/**
	 * 小狗在吃骨头的方法
	 */
	@Override
	public void eat() {
		System.out.println("小狗在吃骨头！");
	}

	/**
	 * 验证方法的返回值是父类也可以是子类
	 */
	@Override
	public Dog saleAnimal() {
		return new Dog();
	}

	@Override
	public String toString() {
		return "Dog [strain=" + strain + "age=" + super.getAge() + "]";
	}

}
