package cn.bdqn.test;

public class Animal {
	private int age;// 所有动物共有的！

	/**
	 * 所有动物共同的方法
	 */
	public void eat() {
		System.out.println("所有动物共同的吃饭");
	}

	/**
	 * @return  购买小动物的方法
	 */
	public Animal saleAnimal() {
		return new Animal();
	}

	/**
	 * 验证父类的静态方法不允许被重写
	 * 
	 * 在子类中使用shift +alt +s  override methods  不会看到这个sayHello()
	 * 说明不能被重写
	 */
	public static void sayHello() {
		System.out.println("所有小动物打招呼的方法");

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
