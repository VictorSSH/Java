package cn.bdqn.bean;

/**
 * Student �� Teacher��ĸ���
 * 
 * 
 * ���ǰ����������й��е����Ժͷ�����ȡ�������У�
 * 
 */
public class Person {
	private int age; // ����
	private String name; // ����
	private String address; // ��ַ

	/**
	 * shift + alt +s +r  ���ɱ����������Ե�set()��get
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
	 * @Override ��д����ķ���
	 */
	@Override
	public String toString() {
		return "age:" + this.age + "name��" + this.name + "address��"
				+ this.address;
	}
}
