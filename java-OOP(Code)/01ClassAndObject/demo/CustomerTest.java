package cn.bdqn.demo;

public class CustomerTest {

	public static void main(String[] args) {
		// ����һ���˿�
		Customer customer1 = new Customer();
		// �����Ը�ֵ
		customer1.ponits = 500;
		customer1.cardType = "��";
		// ���ö������ʾ����
		customer1.showInfo();
	}

}
