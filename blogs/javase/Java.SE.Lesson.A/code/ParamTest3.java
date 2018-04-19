public class ParamTest3
{
	public void change(Person person, Person person2)
	{
		person.name = "lisi";
		person2.name = "wangwu";
	}

	public static void main(String[] args)
	{
		Person person = new Person();
		person.name = "zhangsan";

		//Person person2 = person;
		Person person2 = new Person();

		ParamTest3 test = new ParamTest3();

		test.change(person, person2);

		System.out.println(person.name);

	}


}


class Person
{
	String name;
}




