package important;

import java.util.HashMap;

public class Count_each_char_String {

	public static void main(String[] args) 
	{

		String s="Auf geht Deutschland";
		s.toLowerCase();
		char p []= s.toCharArray();
		
		
		HashMap<Character, Integer> h=new HashMap<Character, Integer>();
		
		for(char c:p)
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
