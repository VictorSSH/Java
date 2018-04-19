package cn.bdqn.exam;

public class TestExam {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B(); // 父类的引用指向了子类的对象
		B b = new B();
		C c = new C();
		D d = new D();

		System.out.println(a1.show(b)); // A AND A
		/**
		 * a1是A类的对象！
		 * 我们传递了一个C对象
		 * C类继承B类 ，B类继承A类
		 * 所以会执行 A类中的  show(A a)
		 */
		System.out.println(a1.show(c)); // A AND A
		System.out.println(a1.show(d)); // A AND D
		/**
		 * a2是父类的引用指向了子类的对象
		 * a2.show（b）应该去A类中查询 show()并且参数是B类型的！
		 * A类中没有参数为B的！
		 * 但是有参数是B类父类的方法的！show(A a)!
		 * 又因为子类B重写了A类的show(A a) 所以执行 B类的show(A a)
		 */
		System.out.println(a2.show(b)); // B AND A
		System.out.println(a2.show(c)); // B AND A
		System.out.println(a2.show(d)); // A AND D
		System.out.println(b.show(b)); // B AND B
		System.out.println(b.show(c)); // B AND B
		/**
		 * b确实是B类的对象！
		 * 但是b.show(d)在B类中没有发现！
		 * 这时候 会去父类中查询 有没有对应的show(d) 因为B类继承了A类
		 * 所以说 A类中的 show(D d)  B类中也有！只不过在A类中！
		 * A类中有就执行！否则就执行B类中的show(B b)  因为D类继承了B类
		 */
		System.out.println(b.show(d)); // A AND D

	}

}
