package cn.bdqn.test;

public class AnimalTest {

	public static void main(String[] args) {
		// ����һ��Сè���һ��С����
		Cat cat = new Cat();
		cat.setAge(20);
		cat.setName("Сèè");
		cat.eat(); // �Լ����е�

		Dog dog = new Dog();
		dog.setAge(25);
		dog.setStrain("����");
		dog.eat();// �Լ����е�

	}

}
