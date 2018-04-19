package cn.bdqn.test;

/**
 * 管理员类
 *  
 */
public class Adminstrator {

	/**
	 * 定义属性   所有的对象 都有
	 */
	String name; // 姓名
	String password; // 密码

	/**
	 * 显示信息的方法
	 */
	public void showInfo() {
		System.out.println("姓名：" + name + ",密码：" + password);
	}
}
