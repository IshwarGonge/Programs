package Volume;
import static java.lang.Math.*;
public class Cone implements Shape
{
	private double radius,height;
	public Cone(double radius,double height)
	{
		this.radius=radius;
		this.height=height;
	}
	
	public double volume()
	{
	
		return PI*pow(radius,2)*(height/3);
	}
}
