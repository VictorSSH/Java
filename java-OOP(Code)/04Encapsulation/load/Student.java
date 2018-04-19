package cn.bdqn.load;

/**
 * 方法重载
 * 01.在一个类中
 * 02.方法名相同
 * 03.参数列表不同
 * 04.与方法的修饰符和返回值类型 无关！
 * 
 * 
 * 其实就是一个静态的多态！
 *    都是买东西，但是根据传递参数的不同得到一个不同的结果！
 */
public class Student {
	int age;

	/**
	 * 构造的重载
	 */
	public Student() {
	}

	public Student(int age) {
		this.age = age;
	}

	/**
	 * 买东西  什么都不给
	 */
	public void buy() {

	}

	/**
	 * 买东西  给钱  没找零
	 */
	public void buy(double money) {

	}

	/**
	 * 买东西  给钱 ,给东西 
	 */
	public void buy(double money, String someThing) {

	}

}
