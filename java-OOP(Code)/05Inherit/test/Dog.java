package cn.bdqn.test;

/**
 * С����
 */
public class Dog extends Animal {
	private String strain;// С�����еģ�������

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	/**
	 * С���ڳԹ�ͷ�ķ���
	 */
	@Override
	public void eat() {
		System.out.println("С���ڳԹ�ͷ��");
	}

	/**
	 * ��֤�����ķ���ֵ�Ǹ���Ҳ����������
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
