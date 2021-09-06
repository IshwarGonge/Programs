import java.util.Scanner;

public class LeapYear
{
	
	private static void leapOrNot(int year)
	{
		if(year%4==0 && year%100!=0 || year%400==0)
		{
			System.out.printf("%d is a Leap Year",year);
		}
		else
		{
			System.out.printf("%d is Not a Leap Year",year);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Year: ");
		int year=s.nextInt();
		
		leapOrNot(year);
	}
}
