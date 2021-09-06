import java.util.*;

public class LargestArrayElement
{
	
	//----------FIRST METHOD-----------
//	static void firstMethod(int array[],int arrayLength)
//	{
//		int max=array[0];
//		System.out.print("Array Elements are: "+array[0]+" ");
//		for(int i=1;i<arrayLength;i++)
//		{
//			System.out.print(array[i]+" ");
//			if(array[i]>max)
//			{
//				max=array[i];
//			}
//		}
//		System.out.println();
//		System.out.println("Largest Element is: "+max);
//	}
	
	
	//--------------SECOND METHOD--------O(n)----------
	static void secondMethod(int array[])
	{
		List<Integer> list = new ArrayList<Integer>(array.length);
		for (int i : array)
		{
		    list.add(i);
		}
		
		System.out.println("Elements in List: "+list);
//		System.out.println(Collections.max(list));
//			or
		Collections.sort(list);
		System.out.println("Largest Element is: "+list.get(list.size()-1));
		
	}
	
	
	public static void main(String args[])
	{
		int array[]={7,3,5,2,1,6,4,9};
		int arrayLength=array.length;
//		firstMethod(array,arrayLength);
		secondMethod(array);
	}
}
