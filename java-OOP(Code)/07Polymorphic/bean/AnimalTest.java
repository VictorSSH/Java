package cn.bdqn.bean;

import java.util.Scanner;

public class AnimalTest {

	public static void main(String[] args) {
		// ʵ����������
		Master master = new Master();
		System.out.println("����ѡ����Ҫιʳ�ĳ�� 01.Сè��   02.С����");
		Scanner input = new Scanner(System.in);
		int choose = input.nextInt();
		// ����һ������ ������ ���ܱ�ʵ���� �������ĸ��������ǲ�֪��
		Animal animal;
		switch (choose) {
		case 1: // ��Сè��ιʳ
			animal = new Cat(); // ���������ָ��������Ķ���
			master.feed(animal);
			break;
		case 2: // ��С����ιʳ
			animal = new Dog();
			master.feed(animal);
			break;
		}

	}
}
