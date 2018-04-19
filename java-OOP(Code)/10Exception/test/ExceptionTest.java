package cn.bdqn.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	/**
	 * ArithmeticException  InputMismatchException
	 * 都是间接的继承了 RuntimeException所以都能被捕获到！
	 * 
	 */
	public static void main(String[] args) {

		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		Scanner input = new Scanner(System.in);
		System.out.println("请您输入一个数字：");
		int num = 0; // 验证三个代码块都能访问这个变量
		try {
			num = input.nextInt();// 获取用户的输入
			System.out.println("您输入的数字是：" + num);
			System.out.println(5 / 1); // 除数不能为0 代码不能执行完毕 我们必须使用异常处理机制
			return; // 先执行finally代码块
		} catch (ArithmeticException e) {
			System.out.println("算术异常");
			e.printStackTrace(); // 打印出 异常信息
		} catch (InputMismatchException e) {
			System.out.println("输入异常");
			// System.exit(1); // 异常退出
			e.printStackTrace(); // 打印出 异常信息
		} catch (Exception e) {
			System.out.println("顶级异常");
			e.printStackTrace(); // 打印出 异常信息
		} finally {
			System.out.println("必须执行的finally代码块");
		}
		System.out.println(4);
		System.out.println(5);

	}
}
