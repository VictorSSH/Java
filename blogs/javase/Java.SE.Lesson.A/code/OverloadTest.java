public class OverloadTest
{
	public int add(int a ,int b)
	{
		return a + b;
	}

	public int add(int a, int b, int c)
	{
		System.out.println(add(a, b));

		return a + b + c;
	}

	public static void main(String[] args)
	{
		OverloadTest test = new OverloadTest();

		int result = test.add(1, 2);
		int result2 = test.add(1, 2, 3);

		System.out.println(result);
		System.out.println(result2);
	}

}
