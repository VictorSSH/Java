package cn.bdqn.bean;

/**
 * 所有动物的父类
 */
public abstract class Animal {

	/**
	 * 定义所有动物共有属性
	 */
	private int age; // 年龄
	private String name; // 姓名

	/**
	 *  所有动物公共的行为
	 *  01.如果不在子类中重写这个eat方法！那么所有的动物吃东西都执行这一个方法！
	 *      显然这种方式不可行！ 怎么办？  子类重写eat（）！
	 *  02.重写方法之后，得到了我们想要的结果！ 每个动物吃饭的方法都不一样！
	 *      我们又发现了一个问题！ 父类的这个eat（）中的输出语句 有意义？？？
	 *      这个输入语句会得到执行吗？？    只要我们重写 这个eat不可能执行！
	 *    那么我们就删除这句话！方法体就没了！｛｝也删除
	 *    报错了？？为什么报错！
	 *      001.加方法体，刚删除，这种方式不可行！
	 *      002.在方法声明时，加入abstract关键字！  可行！
	 *      
	 *        所有由abstract关键字修饰的方法我们称之为  抽象方法！
	 *         抽象方法只能存在于 抽象类中！
	 *        
	 *     又报错了？？
	 *      001.删除abstract关键字 ！ 不可行！
	 *      002.在类上加入abstract关键字 
	 *        
	 *        所有由abstract关键字修饰的类我们称之为  抽象类！
	 *  
	 */
	public abstract void eat();

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal() {
		super();
	}

	public Animal(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [age=" + age + ", name=" + name + "]";
	}

}
