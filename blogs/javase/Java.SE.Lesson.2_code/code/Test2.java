public class Test2
{
	public static void main(String[] args)
	{
		Shape shape = new Triangle(10,6);

		int area = shape.computeArea();

		System.out.println("triangle:" + area);

		shape = new Rectangle(10, 10);

		area = shape.computeArea();

		System.out.println("rectangle:" + area);
	}
}

abstract class Shape
{
	public abstract int computeArea();//计算形状面积
}

class Triangle extends Shape
{
	int width;
	int height;

	public Triangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}

	public int computeArea()
	{
		return (width * height) / 2;
	}
}

class Rectangle extends Shape
{
	int width;
	int height;

	public Rectangle(int width, int height)
	{
		this.width = width;
		this.height = height;
	}

	public int computeArea()
	{
		return this.width * this.height;
	}
}
