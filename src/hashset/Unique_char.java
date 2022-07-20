package hashset;

import java.util.HashSet;

public class Unique_char 
{

	public static void main(String[] args) 
	{
		
		boolean flag=false;
		
		String s="Love Dancing";
		System.out.println(s);
		
		HashSet<Character> h=new HashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			flag=h.add(s.charAt(i));
//			if(flag==false)
//			{
//				break;
//			}
			System.out.println(flag);
		}
		
	}
	
	
	
	
	
	
}
