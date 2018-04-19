public class ArrayTest3
{
	public static void main(String[] args)
	{
		Student[] s = new Student[100];

		for(int i = 0; i < s.length; i++)
		{
			s[i] = new Student();

			s[i].name = i % 2 == 0 ? "zhangsan" : "lisi";
		}

		for(int i = 0; i < s.length; i++)
		{
			System.out.println(s[i].name);
		}
	}
}

class Student
{
	String name;
}
