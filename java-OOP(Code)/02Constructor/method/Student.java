package cn.bdqn.method;

/**
 * ѧ����
 */
public class Student {
	String name; // ����

	/**
	 * ���ι���
	 */
	public Student(String name) {
		this.name = name;
	}

	/**
	 *  ����ķ���
	 *  01.û�з���ֵ
	 *  02.û�в���
	 */
	public void buy() {
		System.out.println(name + "�ڹ���");
	}

	/**
	 * @param money  ĳ�����ѵĽ��
	 * double money  �β�
	 */
	public void buy(double money) {
		System.out.println(name + "�ڹ�����ѽ�" + money);
	}

	/**
	 * @param money ĳ�����ѵĽ��
	 * @param name  ĳ�˵�����
	 * @return   ����ʲô����
	 * 
	 * return  ���������� ���Ҵ��з���ֵ��
	 * ����ֵ������ ������ �����ķ���ֵ���ͣ�
	 * 
	 */
	public String buy(double money, String name) {
		String result = name + "�ڹ�����ѽ�" + money + "==>�õ�һ�������";
		return result;
	}

}
