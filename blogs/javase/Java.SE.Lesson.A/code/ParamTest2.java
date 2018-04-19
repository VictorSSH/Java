public class ParamTest2
{
	public static void main(String[] args)
	{
		C c = new C();

		int a = 1;

		c.changeInt(a);

		System.out.println(a);
	}
}

class C
{
	void changeInt(int a)
	{
		a++;
	}
}
