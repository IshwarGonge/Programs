import java.util.Scanner;
public class Pattern
{
	static private void printStar(int rows)
	{
		for(int row=1;row<=rows;row++)
		{
			for(int space=1;space<=rows-row;space++)
			{
				System.out.print(" ");
			}
			for(int star=1;star<=row;star++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}		
	}
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Rows: ");
		int rows=s.nextInt();
		
		printStar(rows);
		
	}
}