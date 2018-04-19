问题:
怎么创建对象？

  类名  对象名=new 类名();  

在java中只要是看到了（）！ 这就是方法！

构造方法： 创建某个对象的方法！

Student  stu=new Student();

Student()  ==>构造方法

我们并没有在Student类中创建这个构造方法！

为什么我们还能创建对象呢？？

因为 系统默认会给我们创建一个本类的 无参构造方法！  
如果我们 创建了本类的构造方法！ 系统将不再创建！

 public  class  Student{
    int  age;
    Stirng  name;
    
    //系统默认创建的无参构造方法
    public Student(){
    }
 
 }
 
 
只有我们的构造方法才能创建出类的实例（对象）！
 
没有构造方法，我们就无法通过类 来创建对象！

()中没有值，就是无参！

(String name,int age)中有值，就是有参或者带参！



创建构造方法的语法：

访问权限修饰符    类名(){
}

方法的定义：  生活中的行为！

方法在java中怎么定义？语法？


访问修饰符      返回值类型   方法名（形参）｛
         方法体
｝


public  void  showInfo(){

}

所有的方法，只要是没有返回值   返回值类型 必须写成 void  （构造方法除外）



参数列表：
01.参数个数
02.参数类型
03.参数的顺序


参数传递：
01.值传递       传递的是对象的值
      基本数据类型+String类型 作为参数的时候  都是使用的值传递
      
02.引用传递   传递的对象的内存地址
    除了String类型之外的所有引用数据类型 在 作为参数的时候  都是使用的引用传递



值传递 


	public static void main(String[] args) {
		int num1 = 5;
		changeNum(num1);
		System.out.println(num1);
	}

	private static void changeNum(int num2) {
		num2 = 50;
	}




	/**
	 * @param name  用户传递过来的姓名
	 */
	public void changeName(String name) {
		name = "小黑";
	}

	public static void main(String[] args) {
		// 实例化Student对象
		Student stu = new Student();
		// 定义一个姓名
		String name = "小白";
		stu.changeName(name);
		System.out.println(name); // 小白
	}






引用传递 

public class Student {

	String name; // 姓名
	int age; // 年龄

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.name = "老公";
		stu1.age = 50;

		Student stu2 = stu1;
		/**
		 *  把stu1的内存地址 给 stu2
		 *  问题1：
		 *   我们有没有显式给stu2对象的name属性赋值？？  没赋值！！
		 *   我们有没有显式给stu2对象的age属性赋值？？  没赋值！！
		 * 问题2： 
		 * 我们改变stu1或者stu2中的任何一个对象！
		 * 那么另一个对象 也随之改变！
		 * 因为stu1和stu2共享堆中的区域！
		 */

		System.out.println(stu2.name);
		System.out.println(stu2.age);

	}

}




public class Student {

	String name; // 姓名

	public void changeName(Student stu2) {
		stu2.name = "小黑";
	}

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.name = "小白";
		stu1.changeName(stu1);   //Student stu2 =stu1;
		System.out.println(stu1.name);

	}

}


	public static void main(String[] args) {
		String[] names1 = { "小黑", "小白", "小红" };
		System.out.println(names1[0]); // 小黑
		changeNames(names1); // String[] names2=names1;
		System.out.println(names1[0]); // 小黑黑

	}

	private static void changeNames(String[] names2) {
		names2[0] = "小黑黑";
	}




