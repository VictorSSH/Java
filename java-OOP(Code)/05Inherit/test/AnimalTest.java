package cn.bdqn.test;

public class AnimalTest {

	public static void main(String[] args) {
		// 创建一个小猫咪和一个小狗狗
		Cat cat = new Cat();
		cat.setAge(20);
		cat.setName("小猫猫");
		cat.eat(); // 自己特有的

		Dog dog = new Dog();
		dog.setAge(25);
		dog.setStrain("藏獒");
		dog.eat();// 自己特有的

	}

}
