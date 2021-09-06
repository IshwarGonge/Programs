import java.util.Scanner;

public class ReverseString
{
	static int length(String name)
	{
		int i=0;
		for(char c:name.toCharArray())
			i++;
		return i;
	}
	
	static private void reverseIt(String name)
	{
		
		int i,j;
		char temp;
		char array[]=name.toCharArray();
		
		for(i=0,j=length(name)-1;i<j;i++,j--)
		{
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
		}
		
		System.out.print("Reversed: ");
		for(char c:array)
			System.out.print(c);
		
		System.out.println();
		System.out.println("Original: "+name);
	}
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter String To Reverse: ");
		String name=s.next();
		reverseIt(name);
	}

}
