public class Swap3
{
	public static void swap(int[] i)
	{
		int temp = i[0];
		i[0] = i[1];
		i[1] = temp;
	}

	public static void main(String[] args)
	{
		int[] i = {1, 2};

		swap(i);

		System.out.println(i[0]);
		System.out.println(i[1]);
	}
}
