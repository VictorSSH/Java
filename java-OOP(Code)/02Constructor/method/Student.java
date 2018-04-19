package cn.bdqn.method;

/**
 * 学生类
 */
public class Student {
	String name; // 姓名

	/**
	 * 带参构造
	 */
	public Student(String name) {
		this.name = name;
	}

	/**
	 *  购物的方法
	 *  01.没有返回值
	 *  02.没有参数
	 */
	public void buy() {
		System.out.println(name + "在购物");
	}

	/**
	 * @param money  某人消费的金额
	 * double money  形参
	 */
	public void buy(double money) {
		System.out.println(name + "在购物，消费金额：" + money);
	}

	/**
	 * @param money 某人消费的金额
	 * @param name  某人的姓名
	 * @return   买了什么东西
	 * 
	 * return  跳出方法体 并且带有返回值！
	 * 返回值的类型 必须是 方法的返回值类型！
	 * 
	 */
	public String buy(double money, String name) {
		String result = name + "在购物，消费金额：" + money + "==>得到一大包东西";
		return result;
	}

}
