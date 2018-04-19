public class StaticTest
{
	public static void main(String[] args)
	{
		/*
		MyStatic myStatic = new MyStatic();

		MyStatic myStatic2 = new MyStatic();

		myStatic.a = 10;

		System.out.println(myStatic2.a);
		*/


		MyStatic myStatic = new MyStatic();

		MyStatic.a = 10;

		System.out.println(myStatic.a);
	}
}


class MyStatic
{
	static int a;
}




