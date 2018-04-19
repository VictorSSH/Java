package cn.bdqn.bean;

import java.util.Scanner;

public class AnimalTest {

	public static void main(String[] args) {
		// 实例化主人类
		Master master = new Master();
		System.out.println("请您选择需要喂食的宠物： 01.小猫咪   02.小狗狗");
		Scanner input = new Scanner(System.in);
		int choose = input.nextInt();
		// 创建一个动物 抽象类 不能被实例化 具体是哪个动物我们不知道
		Animal animal;
		switch (choose) {
		case 1: // 给小猫咪喂食
			animal = new Cat(); // 父类的引用指向了子类的对象
			master.feed(animal);
			break;
		case 2: // 给小狗狗喂食
			animal = new Dog();
			master.feed(animal);
			break;
		}

	}
}
