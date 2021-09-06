package Volume;

import static java.lang.Math.*;

public class Cube implements Shape
{
	private double edge;
	
	public Cube(double edge)
	{
		this.edge=edge;
	}
	
	public double volume()
	{
		return pow(edge, 3);
	}

}
