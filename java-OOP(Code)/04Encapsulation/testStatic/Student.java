package cn.bdqn.testStatic;

/**
 *   一个类在被jvm加载的时候，首先会加载类中所有由static修饰的方法，属性，代码块！
 *   并把这个数据放进堆中的静态存储区！便于我们访问！
 * 
 * static 可以修饰的内容
 * 01.属性       静态属性
 * 02.方法       静态方法
 * 03.代码块   静态代码块
 * 
 * 
 * 特点：
 *    01. 有static修饰的内容，在整个程序运行期间，只存在一份！
 *    02. 有static修饰的属性和方法，直接可以通过类名.属性 /类名.方法
 *    03. static修饰的方法中 不能访问 非static修饰的的属性！
 *    04.非static修饰的方法中能访问 static修饰的的属性！
 *    
 *    
 *  例子：
 *  之前说过 一个类可以创建N个对象！
 *  每个对象都是独一无二的！
 *  
 *    现在 我们实现N个对象 共享一个属性！
 * 
 */
public class Student {

	static int age; // 静态变量
	String name;

	/**
	 *  创建一个static修饰的静态方法
	 *  之前的方式：
	 *    01.通过类创建对象
	 *    02.通过对象.方法访问
	 *    
	 *    现在
	 *    直接通过类名.方法
	 */

	public static void sayHello() {
		System.out.println("我是一个静态方法");
	}

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.age = 50;
		stu1.name = "小黑";
		Student stu2 = new Student();
		stu2.age = 30;
		stu2.name = "小白";

		System.out.println("stu1的年龄：" + stu1.age);
		System.out.println("stu2的年龄：" + stu2.age);
		System.out.println("stu1的姓名：" + stu1.name);
		System.out.println("stu2的姓名：" + stu2.name);

		/**
		 *  在 age前 加一个修饰符 static
		 *  虽然没有给stu3对象的age属性赋值！
		 *  但是因为age是static修饰的！
		 *  所以所有对象共享这个属性！
		 *  只要有一个对象改变了这个age属性！
		 *  那么所有对象的这个age属性都随之发生变化！
		 */
		Student stu3 = new Student();
		stu3.age = 60;
		System.out.println("stu3的年龄：" + stu3.age);

		Student.sayHello();

	}

}
