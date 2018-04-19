public class StringTest
{
	public static void main(String[] args)
	{
		String str = new String("aa");
		String str2 = new String("aa");

		System.out.println(str.equals(str2));

		String str3 = "aa";
		String str4 = "aa";

		System.out.println(str3.equals(str4));

		System.out.println("-----------------");

		Object object = new Object();
		Object object2 = new Object();

		System.out.println(object.equals(object2));
		System.out.println(object.equals(object));

		System.out.println("-----------------");


	}
}
