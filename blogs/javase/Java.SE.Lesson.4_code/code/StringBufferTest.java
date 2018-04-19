public class StringBufferTest
{
	public static void main(String[] args)
	{
		StringBuffer buffer = new StringBuffer();

		buffer.append("hello").append(" world").append(" welcome").append(100).append(false);
		
		String result = buffer.toString();

		System.out.println(result);
		
		String s = "abc";
		int a = 100;
		boolean b = true;

		String str = s + a + b;

		System.out.println(str);

		System.out.println("-------------");

		int m = 100;
		int n = 200;

		System.out.println("100" + 200);

		System.out.println("-------------");

		System.out.println("false" + true);


		//buffer = buffer.append("hello");
		//buffer.append(" world");
		//buffer.append(" welcome");
	}
}
