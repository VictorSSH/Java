public class ParamTest
{
	public void changePoint(Point p)
	{
		p = new Point();

		p.x = 3;
		p.y = 4;	
	}	
	
	public static void main(String[] args)
	{
		ParamTest pt = new ParamTest();
		Point point = new Point();

		pt.changePoint(point);

		System.out.println(point.x);
		System.out.println(point.y);
	}
}

class Point
{
	int x; //ºá×ø±ê
	int y; //×Ý×ø±ê
}
