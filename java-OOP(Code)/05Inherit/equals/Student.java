package cn.bdqn.equals;

public class Student {

	private int age;
	private String name;

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

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public Student() {
		super();
	}

	/**
	 * ��дObject��ķ���
	 */
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	/**
	 * ��дObject���е�equals
	 * @param  obj   �����û���Ҫ�Ƚ����ݵĶ���
	 */
	@Override
	public boolean equals(Object obj) {
		// 01.���ж��ڴ��ַ�Ƿ�һ��
		if (this == obj) {
			return true;
		}
		// 02.�ж�obj������
		if (!(obj instanceof Student)) { // ˵��obj��������Student����
			return false;
		}
		// 03.����ת��
		Student stu = (Student) obj;
		// 04.��ʼ�ж��������������ֵ�Ƿ�һ��
		if (stu.getAge() == this.age && stu.getName().equals(this.name)) {
			return true;
		}

		return false;
	}
}
