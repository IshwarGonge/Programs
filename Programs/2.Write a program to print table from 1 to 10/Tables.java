import java.util.Scanner;
public class Tables
{
	static void printTables(int lastNumber)
	{
		System.out.println("Squares from 1 to "+lastNumber);
		for(int i=1;i<=lastNumber;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter last number: ");
		int lastNumber=s.nextInt();
		printTables(lastNumber);
	}
}
