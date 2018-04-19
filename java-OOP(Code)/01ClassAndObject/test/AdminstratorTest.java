package cn.bdqn.test;

public class AdminstratorTest {

	public static void main(String[] args) {
		// 创建两个管理员对象
		Adminstrator admin1 = new Adminstrator();
		Adminstrator admin2 = new Adminstrator();
		// 分别给两个对象属性赋值
		admin1.name = "张三";
		admin1.password = "admin";
		admin2.name = "李四";
		admin2.password = "common";

		// 分别调用对象显示的方法
		admin1.showInfo();
		admin2.showInfo();
	}

}
