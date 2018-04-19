public class ReturnTest
{
	public void method(int a)
	{
		if(a < 3)
		{
			System.out.println(++a);
			return;
		}
		
		System.out.println(++a);	
		
	}

	public static void main(String[] args)
	{
		ReturnTest rt = new ReturnTest();

		rt.method(2);
	}
}
