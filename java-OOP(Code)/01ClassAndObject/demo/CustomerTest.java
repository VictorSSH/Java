package cn.bdqn.demo;

public class CustomerTest {

	public static void main(String[] args) {
		// 创建一个顾客
		Customer customer1 = new Customer();
		// 给属性赋值
		customer1.ponits = 500;
		customer1.cardType = "金卡";
		// 调用对象的显示方法
		customer1.showInfo();
	}

}
