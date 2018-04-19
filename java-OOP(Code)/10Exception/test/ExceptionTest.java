package cn.bdqn.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	/**
	 * ArithmeticException  InputMismatchException
	 * ���Ǽ�ӵļ̳��� RuntimeException���Զ��ܱ����񵽣�
	 * 
	 */
	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		Scanner input = new Scanner(System.in);
		System.out.println("��������һ�����֣�");
		int num = 0; // ��֤��������鶼�ܷ����������
		try {
			num = input.nextInt();// ��ȡ�û�������
			System.out.println("������������ǣ�" + num);
			System.out.println(5 / 1); // ��������Ϊ0 ���벻��ִ����� ���Ǳ���ʹ���쳣�������
			return; // ��ִ��finally�����
		} catch (ArithmeticException e) {
			System.out.println("�����쳣");
			e.printStackTrace(); // ��ӡ�� �쳣��Ϣ
		} catch (InputMismatchException e) {
			System.out.println("�����쳣");
			// System.exit(1); // �쳣�˳�
			e.printStackTrace(); // ��ӡ�� �쳣��Ϣ
		} catch (Exception e) {
			System.out.println("�����쳣");
			e.printStackTrace(); // ��ӡ�� �쳣��Ϣ
		} finally {
			System.out.println("����ִ�е�finally�����");
		}
		System.out.println(4);
		System.out.println(5);

	}
}
