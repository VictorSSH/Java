public class ArrayTest6
{
	public static void main(String[] args)
	{
		I[] i = new I[2];
		
		i[0] = new C();
		i[1] = new C();

		int[] a = new int[]{1 , 2 ,3};

		I[] b = new I[]{new C(), new C()};
		
	}
}

interface I
{

}

class C implements I
{

}
