import java.util.Random;

public class RandomTest
{
	public static void main(String[] args)
	{
		Random random = new Random();

		for(int i = 0; i < 50; i++)
		{
			//System.out.println(random.nextInt(41) + 10);
	

		

		double result = Math.random();

		result *= 41;

		int result2 = (int)result;

		result2 += 10;

		System.out.println(result2);

		}
	}
}
