package cn.bdqn.test;

/**
 * Сè��
 */
public class Cat extends Animal {
	private String name; // Сè���еģ�������

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Сè����ķ���
	 */
	@Override
	public void eat() {
		System.out.println("Сè����ķ���");
	}

	/**
	 * ��֤�����ķ���ֵ�Ǹ���Ҳ����������
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
