package cn.bdqn.exam;

public class TestExam {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B(); // ���������ָ��������Ķ���
		B b = new B();
		C c = new C();
		D d = new D();

		System.out.println(a1.show(b)); // A AND A
		/**
		 * a1��A��Ķ���
		 * ���Ǵ�����һ��C����
		 * C��̳�B�� ��B��̳�A��
		 * ���Ի�ִ�� A���е�  show(A a)
		 */
		System.out.println(a1.show(c)); // A AND A
		System.out.println(a1.show(d)); // A AND D
		/**
		 * a2�Ǹ��������ָ��������Ķ���
		 * a2.show��b��Ӧ��ȥA���в�ѯ show()���Ҳ�����B���͵ģ�
		 * A����û�в���ΪB�ģ�
		 * �����в�����B�ุ��ķ����ģ�show(A a)!
		 * ����Ϊ����B��д��A���show(A a) ����ִ�� B���show(A a)
		 */
		System.out.println(a2.show(b)); // B AND A
		System.out.println(a2.show(c)); // B AND A
		System.out.println(a2.show(d)); // A AND D
		System.out.println(b.show(b)); // B AND B
		System.out.println(b.show(c)); // B AND B
		/**
		 * bȷʵ��B��Ķ���
		 * ����b.show(d)��B����û�з��֣�
		 * ��ʱ�� ��ȥ�����в�ѯ ��û�ж�Ӧ��show(d) ��ΪB��̳���A��
		 * ����˵ A���е� show(D d)  B����Ҳ�У�ֻ������A���У�
		 * A�����о�ִ�У������ִ��B���е�show(B b)  ��ΪD��̳���B��
		 */
		System.out.println(b.show(d)); // A AND D

	}

}
