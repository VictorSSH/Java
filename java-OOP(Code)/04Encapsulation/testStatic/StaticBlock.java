package cn.bdqn.testStatic;

/**
 * 验证静态代码块和普通代码块的执行顺序
 * 静态代码块优先执行！
 * 
 * 如果有多个静态代码块或者普通代码块
 * 按照书写的顺序执行！
 */
public class StaticBlock {

	public StaticBlock() {
		System.out.println(" 无参构造");
	}

	{
		System.out.println("普通代码块1");
	}

	{
		System.out.println("普通代码块2");
	}

	static {
		System.out.println("静态代码块1");
	}
	static {
		System.out.println("静态代码块2");
	}

	public static void main(String[] args) {
		// 实例化对象
		StaticBlock s = new StaticBlock();
	}

}
