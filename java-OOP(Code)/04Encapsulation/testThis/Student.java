package cn.bdqn.testThis;

/**
 * ��дʵ����Ĳ���
 * 01.��������
 * 02.��ݼ�����set  get
 * 03.��ݼ�����  �в� �޲ι���
 * 04.����toString()
 */
public class Student {
	private int age;
	private String name; // ����

	/**
	 * set��get�������ƺ�ĵ�һ������ ����ĸСд ===��������
	 * 
	 * 01.this���ñ���Ĺ��췽��ʱ��ֻ�ܴ��ڹ��췽���еĵ�һ�У�
	 * 02.this�����Է������ǵ����Ժͷ��� ���Դ����κ�λ�ã�
	 */
	public Student() {
		this(50, "С��"); // ���ñ���Ĵ��ι���
	}

	public Student(int age, String name) {
		// this(); ���ñ�����޲ι���
		this.age = age;
		this.name = name;
	}

	// set get����
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

}
