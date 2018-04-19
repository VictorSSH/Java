public class FinalTest3
{
	public static void main(String[] args)
	{
		People people = new People();
		//people.age = 20;
		
		//people.address = new Address();
		
		people.address.name = "shanghai";
		
	}
}

class People
{
	//final int age = 10;
	final Address address = new Address();
}

class Address
{
	String name = "beijing";
}

