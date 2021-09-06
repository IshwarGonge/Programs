import java.util.Scanner;
import java.util.*;
public class Fibonacci
{
	
	private static void fibonacci(int first,int second,int num)
	{
		int sum,counter=0;
		
		int arraysize=num+2;
		
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(first);
		al.add(second);
		
		System.out.printf("Fibonacci Series : %d %d | ",first,second);
		
		while(counter<num)
		{
			sum=first+second;
			al.add(sum);
			System.out.print(sum+" ");
			first=second;
			second=sum;
			counter++;
		}
		System.out.println();
		
		
		System.out.print("Search Nth Element: ");
		Scanner s=new Scanner(System.in);
		
		int element=s.nextInt();
		System.out.println(element+"th element is: "+al.get(element-1));
	
		
		
	}
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter First Number: ");
		int first=s.nextInt();
		
		System.out.print("Enter Second Number: ");
		int second=s.nextInt();
		
		System.out.print("How Many Terms You want: ");
		int num=s.nextInt();
		fibonacci(first,second,num);
		
	}
}
