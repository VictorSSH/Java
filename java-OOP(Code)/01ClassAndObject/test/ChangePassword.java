package cn.bdqn.test;

import java.util.Scanner;

public class ChangePassword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// ��ʼ��һ������Ա���� ����ƥ��
		Adminstrator admin = new Adminstrator();
		admin.name = "zhangsan";
		admin.password = "12345";
		// ��ȡ�û�������
		System.out.println("�������û���:");
		String name = input.next();
		System.out.println("����������:");
		String password = input.next();
		// ��ʼƥ��
		if (name.equals(admin.name) && password.equals(admin.password)) {
			System.out.println("����������ȷ�������������룺");
			admin.password = input.next();
			System.out.println("�����µ�������Ϊ��" + admin.password);
		} else {
			System.out.println("�����û���������������");
		}

	}

}
