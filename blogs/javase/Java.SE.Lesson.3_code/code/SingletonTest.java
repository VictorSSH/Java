public class SingletonTest
{
	public static void main(String[] args)
	{
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		System.out.println(singleton == singleton2);
	}
}


class Singleton
{
	private static Singleton singleton;
	
	private Singleton()
	{
		
	}

	public static Singleton getInstance()
	{
		if(singleton == null)
		{
			singleton = new Singleton();
		}

		return singleton;
	}


}
