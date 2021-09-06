package Area;

public class Circle implements Shape
{
	 private static double PI=3.14;
	private double radius;
	 
	public Circle(double radius)
	{
		this.radius=radius;
	}
	
	public double area()
	{
		return PI*radius*radius;
	}

}
