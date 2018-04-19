public class PolyTest5
{
	/*
	public void run(BMW bmw)
	{
		bmw.run();
	}

	public void run(QQ qq)
	{
		qq.run();
	}
	*/

	public void run(Car car)
	{
		car.run();
	}

	public static void main(String[] args)
	{
		/*
		 PolyTest5 test = new PolyTest5();

		BMW bmw = new BMW();

		test.run(bmw);

		QQ qq = new QQ();

		test.run(qq);
		*/
		
		PolyTest5 test = new PolyTest5();

		Car car = new BMW();

		test.run(car);
		
		QQ qq = new QQ();

		test.run(qq);


	}
}

class Car
{
	public void run()
	{
		System.out.println("car is running");
	}
}

class BMW extends Car
{
	public void run()
	{
		System.out.println("BMW is running");
	}
}

class QQ extends Car
{
	public void run()
	{
		System.out.println("QQ is running");
	}
}


