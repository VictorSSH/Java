package cn.bdqn.bean;

/**
 * ѧ����
 * 
 * ���������������ԣ�
 * 01.��װ
 *     ��������ĳЩ��Ϣ���������ڲ���������������ֱ�ӷ��ʣ�����ͨ�������ṩ�ķ������������ص���Ϣ��
 *     Ŀ�ģ���������ڲ�ϸ�ڣ� ��ȫ��
 *   
 *   ���裺
 *     001.�����е����� ˽�л�
 *     002.�������Զ�Ӧ��set��get����     shift +alt +s  +r ���������������б�����set��get����
 *     003.�ڶ�Ӧ��set����get������ �����߼��жϣ�ȷ�����ݵ���Ч�ԣ�
 * 
 * 
 * 02.�̳�
 * 03.��̬
 * 
 */
public class Student {
	private int age; // ����
	private String name; // ����
	private char sex; // �Ա�

	/**
	 * get() ��Ϊ�˱��˻�ȡֵ
	 * set() ��Ϊ�˸����Ը�ֵ
	 * shift +alt +s  +r ���������������б�����set��get����
	 * 
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

	public char getSex() {
		return sex;
	}

	/**
	 * @param sex  �û��������� �û��Ա�
	 * ����û�������ǲ����������ݣ�
	 * ����Ĭ��sex='��'
	 */
	public void setSex(char sex) {
		if (sex == '��' || sex == 'Ů') {
			this.sex = sex;
		} else {
			// ����������
			this.sex = '��';
		}
	}

}
