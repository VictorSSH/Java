package cn.bdqn.testStatic;

/**
 * ��֤��̬��������ͨ������ִ��˳��
 * ��̬���������ִ�У�
 * 
 * ����ж����̬����������ͨ�����
 * ������д��˳��ִ�У�
 */
public class StaticBlock {

	public StaticBlock() {
		System.out.println(" �޲ι���");
	}

	{
		System.out.println("��ͨ�����1");
	}

	{
		System.out.println("��ͨ�����2");
	}

	static {
		System.out.println("��̬�����1");
	}
	static {
		System.out.println("��̬�����2");
	}

	public static void main(String[] args) {
		// ʵ��������
		StaticBlock s = new StaticBlock();
	}

}
