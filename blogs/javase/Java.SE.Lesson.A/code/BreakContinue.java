public class BreakContinue
{
	public static void main(String[] args)
	{
		for(int i = 0; i < 10; ++i)
		{
			if(i == 3 || i == 5)
			{
				continue;
			}

			for(int j = 0; j < i; ++j)
			{
				if(i + j > 5)
				{
					break;
				}
				System.out.println(i + j);
			}

			if(i == 6)
			{
				break;
			}
		}

	}
}
