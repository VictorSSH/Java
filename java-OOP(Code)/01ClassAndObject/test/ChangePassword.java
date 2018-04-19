package cn.bdqn.test;

import java.util.Scanner;

public class ChangePassword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 初始化一个管理员对象 用于匹配
		Adminstrator admin = new Adminstrator();
		admin.name = "zhangsan";
		admin.password = "12345";
		// 获取用户的输入
		System.out.println("请输入用户名:");
		String name = input.next();
		System.out.println("请输入密码:");
		String password = input.next();
		// 开始匹配
		if (name.equals(admin.name) && password.equals(admin.password)) {
			System.out.println("您的输入正确！请输入新密码：");
			admin.password = input.next();
			System.out.println("您更新的新密码为：" + admin.password);
		} else {
			System.out.println("您的用户名或者密码有误！");
		}

	}

}
