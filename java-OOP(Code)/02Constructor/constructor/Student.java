package cn.bdqn.constructor;

/**
 * ѧ����
 * ctrl+o  ��ѯ������������� �ͷ���
 */
public class Student {
	int age; // ����
	String name; // ����

	// �Լ�����һ������� �޲� ���췽��
	public Student() {
	}

	/**
	 *  ����һ������� ���� ���췽��
	 * @param name   �û����ݹ�����  ����
	 * @param age    �û����ݹ�����  ����
	 * 
	 * name ��age  ��������Student���ι����е� �β� �� Ҳ�� �ֲ�������
	 *  �βκ� ��Ա���� ͬ���ˣ�����
	 *  ȡ˭��ʵ���õ����ĸ�������
	 *  ��ô������ͬ���������أ���
	 *  ʹ�ùؼ��� this ==>��ǰ��Ķ���
	 */
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

}
