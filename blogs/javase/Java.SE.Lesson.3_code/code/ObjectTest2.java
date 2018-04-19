public class ObjectTest2
{
	public static void main(String[] args)
	{
		Object object = new Object();
		Object object2 = new Object();

		System.out.println(object == object2);

		System.out.println("----------------");


		String str = new String("aaa");
		String str2 = new String("aaa");

		System.out.println(str == str2);

		System.out.println("----------------");

		String str3 = "bbb";
		String str4 = "bbb";

		System.out.println(str3 == str4);
		
		System.out.println("----------------");

		String str5 = new String("ccc");
		String str6 = "ccc";

		System.out.println(str5 == str6);

		System.out.println("----------------");

		String s = "hello";
		String s1 = "hel";
		String s2 = "lo";

		System.out.println(s == s1 + s2);

		System.out.println("----------------");

		System.out.println(s == "hel" + "lo");


	}
}
