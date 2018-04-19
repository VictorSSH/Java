package cn.bdqn.equals;

public class StudentTest {

	/**
	 * 基本数据类型   ==比较的是值！
	 * 引用数据类型   ==比较的是内存地址！ 
	 */
	public static void main(String[] args) {
		Student stu1 = new Student(25, "小黑");
		Student stu2 = new Student(25, "小黑");
		System.out.println(stu1 == stu2);
		/**
		 * equals在object类中  执行的就是 == 比较的是内存地址!
		 */
		System.out.println(stu1.equals(stu2));

	}

}
