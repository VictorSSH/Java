����:
��ô��������

  ����  ������=new ����();  

��java��ֻҪ�ǿ����ˣ����� ����Ƿ�����

���췽���� ����ĳ������ķ�����

Student  stu=new Student();

Student()  ==>���췽��

���ǲ�û����Student���д���������췽����

Ϊʲô���ǻ��ܴ��������أ���

��Ϊ ϵͳĬ�ϻ�����Ǵ���һ������� �޲ι��췽����  
������� �����˱���Ĺ��췽���� ϵͳ�����ٴ�����

 public  class  Student{
    int  age;
    Stirng  name;
    
    //ϵͳĬ�ϴ������޲ι��췽��
    public Student(){
    }
 
 }
 
 
ֻ�����ǵĹ��췽�����ܴ��������ʵ�������󣩣�
 
û�й��췽�������Ǿ��޷�ͨ���� ����������

()��û��ֵ�������޲Σ�

(String name,int age)����ֵ�������вλ��ߴ��Σ�



�������췽�����﷨��

����Ȩ�����η�    ����(){
}

�����Ķ��壺  �����е���Ϊ��

������java����ô���壿�﷨��


�������η�      ����ֵ����   ���������βΣ���
         ������
��


public  void  showInfo(){

}

���еķ�����ֻҪ��û�з���ֵ   ����ֵ���� ����д�� void  �����췽�����⣩



�����б�
01.��������
02.��������
03.������˳��


�������ݣ�
01.ֵ����       ���ݵ��Ƕ����ֵ
      ������������+String���� ��Ϊ������ʱ��  ����ʹ�õ�ֵ����
      
02.���ô���   ���ݵĶ�����ڴ��ַ
    ����String����֮������������������� �� ��Ϊ������ʱ��  ����ʹ�õ����ô���



ֵ���� 


	public static void main(String[] args) {
		int num1 = 5;
		changeNum(num1);
		System.out.println(num1);
	}

	private static void changeNum(int num2) {
		num2 = 50;
	}




	/**
	 * @param name  �û����ݹ���������
	 */
	public void changeName(String name) {
		name = "С��";
	}

	public static void main(String[] args) {
		// ʵ����Student����
		Student stu = new Student();
		// ����һ������
		String name = "С��";
		stu.changeName(name);
		System.out.println(name); // С��
	}






���ô��� 

public class Student {

	String name; // ����
	int age; // ����

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.name = "�Ϲ�";
		stu1.age = 50;

		Student stu2 = stu1;
		/**
		 *  ��stu1���ڴ��ַ �� stu2
		 *  ����1��
		 *   ������û����ʽ��stu2�����name���Ը�ֵ����  û��ֵ����
		 *   ������û����ʽ��stu2�����age���Ը�ֵ����  û��ֵ����
		 * ����2�� 
		 * ���Ǹı�stu1����stu2�е��κ�һ������
		 * ��ô��һ������ Ҳ��֮�ı䣡
		 * ��Ϊstu1��stu2������е�����
		 */

		System.out.println(stu2.name);
		System.out.println(stu2.age);

	}

}




public class Student {

	String name; // ����

	public void changeName(Student stu2) {
		stu2.name = "С��";
	}

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.name = "С��";
		stu1.changeName(stu1);   //Student stu2 =stu1;
		System.out.println(stu1.name);

	}

}


	public static void main(String[] args) {
		String[] names1 = { "С��", "С��", "С��" };
		System.out.println(names1[0]); // С��
		changeNames(names1); // String[] names2=names1;
		System.out.println(names1[0]); // С�ں�

	}

	private static void changeNames(String[] names2) {
		names2[0] = "С�ں�";
	}




