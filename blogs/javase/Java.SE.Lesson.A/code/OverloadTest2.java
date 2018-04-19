public class OverloadTest2
{
	public int method(int a)
	{
		System.out.println(a);
		return 1;
	}

	public boolean method(int a)
	{
		System.out.println(a);
		return false;
	}
	
	public static void main(String[] args)
	{
		OverloadTest2 test = new OverloadTest2();

		test.method(1);
		test.method(2);
	}
	
}
