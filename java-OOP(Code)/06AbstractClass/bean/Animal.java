package cn.bdqn.bean;

/**
 * ���ж���ĸ���
 */
public abstract class Animal {

	/**
	 * �������ж��ﹲ������
	 */
	private int age; // ����
	private String name; // ����

	/**
	 *  ���ж��﹫������Ϊ
	 *  01.���������������д���eat��������ô���еĶ���Զ�����ִ����һ��������
	 *      ��Ȼ���ַ�ʽ�����У� ��ô�죿  ������дeat������
	 *  02.��д����֮�󣬵õ���������Ҫ�Ľ���� ÿ������Է��ķ�������һ����
	 *      �����ַ�����һ�����⣡ ��������eat�����е������� �����壿����
	 *      �����������õ�ִ���𣿣�    ֻҪ������д ���eat������ִ�У�
	 *    ��ô���Ǿ�ɾ����仰���������û�ˣ�����Ҳɾ��
	 *    �����ˣ���Ϊʲô����
	 *      001.�ӷ����壬��ɾ�������ַ�ʽ�����У�
	 *      002.�ڷ�������ʱ������abstract�ؼ��֣�  ���У�
	 *      
	 *        ������abstract�ؼ������εķ������ǳ�֮Ϊ  ���󷽷���
	 *         ���󷽷�ֻ�ܴ����� �������У�
	 *        
	 *     �ֱ����ˣ���
	 *      001.ɾ��abstract�ؼ��� �� �����У�
	 *      002.�����ϼ���abstract�ؼ��� 
	 *        
	 *        ������abstract�ؼ������ε������ǳ�֮Ϊ  �����࣡
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
