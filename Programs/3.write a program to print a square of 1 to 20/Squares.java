import java.security.acl.LastOwnerException;
import java.util.Scanner;

public class Squares
{
	static void printSquares(int lastNumber)
	{
		System.out.println("Printing Squares from 1 to "+lastNumber);
		
		int i=1;
		while(i<=lastNumber)
		{
			System.out.println("Square of "+i+" is "+i*i);
			i++;
		}
		
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Last Number: ");
		int lastNumber=s.nextInt();
		printSquares(lastNumber);
	}
}