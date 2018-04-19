public class ArraySearchTest
{
	public static int search(int[] array, int value)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(value == array[i])
			{
				return i;
			}
		}

		return -1;
	}


	public static int binarySearch(int[] array, int value)
	{
		int low = 0;
		int high = array.length - 1;
		int middle;

		while(low <= high)
		{
			middle = (low + high) / 2;

			for(int i = 0; i < array.length; i++)
			{
				System.out.print(array[i]);

				if(i == middle)
				{
					System.out.print("#");
				}

				System.out.print(" ");
			}
			
			System.out.println();


			if(array[middle] == value)
			{
				return middle;
			}

			if(value < array[middle])
			{
				high = middle - 1;
			}
			if(value > array[middle])
			{
				low = middle + 1;
			}
		}

		return -1;

	}

	public static void main(String[] args)
	{
		int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

		int value = 11;

		int index = search(a, value);

		System.out.println(index);

		System.out.println("-----------------");

		int[] b = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

		int index2 = binarySearch(b , 10);

		System.out.println(index2);
	}
}
