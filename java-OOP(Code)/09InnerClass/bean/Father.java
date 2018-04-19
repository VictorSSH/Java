package cn.bdqn.bean;

public class Father { // 外部类
	/**
	 * 外部类的成员变量
	 */
	private static int age = 5;
	private String name = "小黑";

	class Son { // 成员内部类
		int age = 50;
		String name = "小白";

		/**
		 * 内部类打招呼的方法
		 */
		public void sayHello() {
			System.out.println("外部类的姓名：" + Father.this.name);
		}
	}

	/**
	 * 外部类的方法
	 */
	public void getSon() {
		class Son { // 局部内部类 只能在getSon（）中使用
			public void sayBye() {
				System.out.println("局部内部类 bye ");
			}
		}
		Son son = new Son(); // 仅限于方法体内使用
		son.sayBye();
	}

	static class Son2 { // 静态内部类
		public void sayBye() {
			System.out.println("静态内部类====》 bye " + age);
		}
	}

}
