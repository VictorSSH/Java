public class Swap2
{
	public static void swap(char[] ch, char c)
	{
		ch[0] = 'B';
		c = 'D';
	}

	public static void main(String[] args)
	{
		char[] ch = {'A', 'C'};

		swap(ch, ch[1]);

		for(int i = 0; i < ch.length; i++)
		{
			System.out.println(ch[i]);
		}
	}
}
