package cn.bdqn.demo;

/**
 * �˿���
 */
public class Customer {
	/**
	 * ��������
	 */
	int ponits; // ����
	String cardType; // ������

	/**
	 * ��ʾ���ͻ��ֵķ���
	 */
	public void showInfo() {
		System.out.println("������:" + cardType + ",����" + ponits);
	}
}
