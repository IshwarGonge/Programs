package Volume;
import static java.lang.Math.*;
public class Cylinder implements Shape
{	
	double radius,height;
	public Cylinder(double radius,double height)
	{
		this.radius=radius;
		this.height=height;
	}
	
	public double volume()
	{
		
		return PI*pow(radius,2)*height;
	}

}
