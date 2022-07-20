package string;

import java.util.HashMap;

public class Count_each_word_String {

	public static void main(String[] args) 
	{

		String s="Auf geht Deutschland Auf";
		s.toLowerCase();
		String p []= s.split(" ");
		
		
		HashMap<String, Integer> h=new HashMap<String, Integer>();
		
		for(String c:p)
		{
			if(h.containsKey(c))
			{
				h.put(c, h.get(c)+1);
			}
			else
			{
				h.put(c, 1);
		     }
			
		}
		System.out.println("Indivisual Count \n"+h);
		
		
		
		
		
		
		
		
	}

}
