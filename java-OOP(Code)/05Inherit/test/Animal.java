package cn.bdqn.test;

public class Animal {
	private int age;// ���ж��ﹲ�еģ�

	/**
	 * ���ж��ﹲͬ�ķ���
	 */
	public void eat() {
		System.out.println("���ж��ﹲͬ�ĳԷ�");
	}

	/**
	 * @return  ����С����ķ���
	 */
	public Animal saleAnimal() {
		return new Animal();
	}

	/**
	 * ��֤����ľ�̬������������д
	 * 
	 * ��������ʹ��shift +alt +s  override methods  ���ῴ�����sayHello()
	 * ˵�����ܱ���д
	 */
	public static void sayHello() {
		System.out.println("����С������к��ķ���");

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
