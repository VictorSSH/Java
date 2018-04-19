public class StaticTest3
{
	public static void main(String[] args)
	{
		M m = new N();

		m.output();
	}
}

class M
{
	public void output()
	{
		System.out.println("M");
	}
}

class N extends M
{
	public static void output()
	{
		System.out.println("N");
	}
}







