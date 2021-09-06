package programs;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Lorem
{
	
	static void performOp()throws IOException
	{
		//------------------READING FILE
				File f1=new File("D:\\try1.txt");
				File f2=new File("D:\\try2.txt");
				
					String data;
					String token;
					String fileData="";
					

					List<String> list=new ArrayList<String>();
					
					BufferedReader br=new BufferedReader(new FileReader(f1));	
					while((data=br.readLine())!=null)
					{
						 fileData=fileData+" "+data+"\n";

					}
					br.close();
					
		//-----------TOKENIZING FILE
					StringTokenizer st=new StringTokenizer(fileData,".,; ");
					while(st.hasMoreTokens())
					{
						token=st.nextToken();
						list.add(token);
					}
					
					
		//-----------STORING IN HASH TO COUNT FREQUENCY
					HashMap<String,Integer> hm=new HashMap<String,Integer>();
					for (String i : list) {
			            Integer j = hm.get(i);
			            hm.put(i, (j == null) ? 1 : j + 1);
			            
			        }
					
						
		//----------SORTING 
					TreeMap<String,Integer> tm=new TreeMap<>();
					tm.putAll(hm);
				
					
		//----------WRITING IN FILE
					BufferedWriter bw = new BufferedWriter(new FileWriter(f2));
					for(Map.Entry m:tm.entrySet())
						bw.write(m.getValue()+" "+m.getKey()+"\n");
					bw.close();

					System.out.println("Done");
		
	}
	
	
	public static void main(String[] args)throws IOException
	{
		
		performOp();

			
	}
}
