package Volume;

import static java.lang.Math.*;

public class Spheres implements Shape
{
	private double radius;
	
	public Spheres(double radius)
	{
		this.radius=radius;
	}
	
	public double volume()
	{
		return 1.33*PI*pow(radius,3);
	}

}
