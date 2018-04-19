import java.util.Arrays;

public class ArrayEqualsTest
{
	// compare the content of two arrays
	public static boolean isEquals(int[] a, int[] b)
	{
		if(a == null || b == null)
		{
			return false;
		}

		if(a.length != b.length)
		{
			return false;
		}
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] != b[i])
			{
				return false;
			}
		}

		return true;
	}
	
	
	public static void main(String[] args)
	{
		int[] a = {1, 2, 3};
		int[] b = {1, 2, 3};

		System.out.println(isEquals(a, b));


		System.out.println("----------");

		System.out.println(Arrays.equals(a, b));
	}
}
