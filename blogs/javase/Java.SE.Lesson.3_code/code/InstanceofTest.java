public class InstanceofTest
{
	public static void main(String[] args)
	{
		People people = new Man();

		System.out.println(people instanceof People);
	}
}

class People
{

}

class Man extends People
{

}
