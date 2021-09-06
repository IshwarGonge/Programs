import java.util.Scanner;
import static java.lang.Math.*;
public class PrimeNumbers
{
	
	static void primeNumber(int n)
	{
		int i;
		String  primeNumbers = "";
		
		for (i = 1; i <= n; i++)  	   
	      {
			int flag=0;
			
			if(i==1)
				flag=1;
			
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			
			if(flag==0)
			{
				primeNumbers = primeNumbers + i + " ";
			}
	      }
		
		System.out.println("Prime Numbers Till "+n+" are :"+primeNumbers);
	}
	
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Last Number: ");
		int n=s.nextInt();
		primeNumber(n);
	}
}
