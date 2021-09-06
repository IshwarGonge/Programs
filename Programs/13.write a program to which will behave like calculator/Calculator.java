import java.util.Scanner;

public class Calculator
{
	static private void performOp(double num1,double num2,char operation)
	{
		double result=0;
		switch(operation)
		{
		case '+':
			result=num1+num2;
			System.out.println(num1+" + "+num2+ ": "+result);
			break;
			
		case '-':
			result=num1-num2;
			System.out.println(num1+" - "+num2+ ": "+result);
			break;
		
		case '*':
			result=num1*num2;
			System.out.println(num1+" * "+num2+ ": "+result);
			break;
		
		case '/':
			if(num2!=0)
			{
				result=num1/num2;
				System.out.println(num1+" / "+num2+ ": "+result);
			}
			else
				System.out.println(num1+" / "+num2+ ": "+"Cant divide by 0");
			break;
			
		default:
			System.out.println("Invalid Operation");
			break;
			
		
		}
	}
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter First Number: ");
		double num1=s.nextDouble();
		System.out.print("Enter Second Number: ");
		double num2=s.nextDouble();
		System.out.print("Select Operation[+,-,*,/]: ");
		char operation=s.next().charAt(0);
		
		performOp(num1,num2,operation);
	}
}
