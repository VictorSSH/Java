public class PolyTest
{
	public static void main(String[] args)
	{
		Flower rose = new Rose(); //∂‡Ã¨
		rose.sing();
	}
}

class Flower
{
	public void sing()
	{
		System.out.println("flower is singing");
	}
}

class Rose extends Flower
{
	
}
