public class People
{
	int age;

	public void change2(People p)
	{
		p = new People();
		p.age++;
	}

	public void change3(People p, int i)
	{
		p.age++;
		i++;
	}

	public void change(int i)
	{
		i++;
	}

	public static void main(String[] args)
	{
		/*
		People people = new People();

		int a = 0;

		people.change(people.age);

		System.out.println(people.age);

		*/

		/*

		People people = new People();

		people.change2(people);

		System.out.println(people.age);
		*/

		People people = new People();
		
		people.change3(people, people.age);

		System.out.println(people.age);


	}
}
