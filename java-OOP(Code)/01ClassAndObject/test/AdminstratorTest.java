package cn.bdqn.test;

public class AdminstratorTest {

	public static void main(String[] args) {
		// ������������Ա����
		Adminstrator admin1 = new Adminstrator();
		Adminstrator admin2 = new Adminstrator();
		// �ֱ�������������Ը�ֵ
		admin1.name = "����";
		admin1.password = "admin";
		admin2.name = "����";
		admin2.password = "common";

		// �ֱ���ö�����ʾ�ķ���
		admin1.showInfo();
		admin2.showInfo();
	}

}
