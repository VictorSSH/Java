public class InheritenceTest2
{
	public static void main(String[] args)
	{
		Dog dog = new Dog();
		dog.run();
	}	
}

class Animal
{
	public void run()
	{
		System.out.println("animal is running");
	}
}

class Dog extends Animal
{
	public void run()
	{	
		System.out.println("dog is running");
		super.run(); //调用父类的run方法
	}
}
