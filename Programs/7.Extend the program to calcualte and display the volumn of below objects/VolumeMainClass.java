package Volume;

public class VolumeMainClass
{
	public static void main(String[] args)
	{
		Shape s=new Cone(5,5);
		System.out.println("Volume Of Cone: "+s.volume());
		
		s=new Cube(5.5);
		System.out.println("Volume Of Cube: "+s.volume());
		
		s=new Cylinder(6.3, 10);
		System.out.println("Volume Of Cylinder: "+s.volume());
		
		s=new Spheres(7.7);
		System.out.println("Volume Of Spheres: "+s.volume());
	}
}
