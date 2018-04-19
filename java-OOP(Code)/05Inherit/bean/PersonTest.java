package cn.bdqn.bean;

public class PersonTest {

	public static void main(String[] args) {
		// 创建了一个学生对象
		Student stu = new Student();
		stu.setName("张三");
		stu.setAge(50);
		stu.setAddress("天堂");
		/**
		 *  输出学生对象
		 *  cn.bdqn.bean.Student@2b0a141e
		 *  cn.bdqn.bean.Student   全类名/完整限定名
		 *  @2b0a141e   ？？？
		 *  
		 *  只要是我们创建的一个类，默认都是继承Object！
		 *  我们创建的类 是   引用数据类型！
		 *  
		 *  我们通过类可以创建N个对象！
		 *  如果我们直接输出了对象！
		 *  那么就会默认执行Object类中的toString()
		 */
		System.out.println(stu);

		// 创建一个教师对象
		Teacher tea = new Teacher();
		tea.setName("李四");
		tea.setAge(50);
		tea.setAddress("地域");
		// 输出教师对象
		System.out.println(tea);
	}

}
