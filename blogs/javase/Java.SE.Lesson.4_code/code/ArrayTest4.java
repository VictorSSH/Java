public class ArrayTest4
{
	public static void main(String[] args)
	{
		int[][] a = new int[2][3];

		//System.out.println(i[0] instanceof int[]);
		
		int m = 0;

		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				m++;
				a[i][j] = 2 * m;		
			}
		}
		
	}
}


