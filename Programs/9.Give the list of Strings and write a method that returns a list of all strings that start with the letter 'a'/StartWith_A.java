import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface usingLambda
{
	List<String> show(List<String> list);
}


public class StartWith_A
{	
	
	static usingLambda ul=(List<String> list)->{
		
		List<String> newList=new ArrayList<String>();
		
		for(String name:list)
		{
			if(name.charAt(0)=='a')
			{
				newList.add(name);
			}
			
		}
		return newList;
	};
	
	
	public static void main(String[] args)
	{	
		List<String> list = new ArrayList<String>();
		
		list.add("google");
		list.add("amazon");
		list.add("microsoft");
		list.add("atos-syntel");
		list.add("quantafic");
		list.add("apple");
		
		
		List<String> returnedList=ul.show(list);
		
		System.out.println("Original List: "+list);
		System.out.println("List Of Names Start With 'a' : "+returnedList);
	}
}
