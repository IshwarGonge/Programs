package Area;

public class AreaMainClass
{
	public static void main(String[] args)
	{
		Shape s=new Circle(5);
		System.out.println("Area Of Circle: "+s.area());
		
		s=new Rectangle(10.5,5.6);
		System.out.println("Area Of Rectangle: "+s.area());
		
		s=new Square(5);
		System.out.println("Area Of Square: "+s.area());
		
		s=new Triangle(5.3,5.5);
		System.out.println("Area Of Triangle: "+s.area());
	}
}
