public class Test4
{
	public static void main(String[] args)
	{
		/*
		BB bb = new BB();

		AA aa = bb;

		bb.output();
		*/


		AA aa = new BB();
		
		BB bb = (BB)aa;

		bb.output();
	}
}

interface AA
{
	public void output();
}


class BB implements AA
{
	public void output()
	{
		System.out.println("BB");
	}
}


