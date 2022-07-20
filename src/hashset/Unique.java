package hashset;

import java.util.HashSet;

public class Unique {

	public static void main(String[] args)
	{
       String l="ffggttnjklpm";
       
       HashSet<Character> h=new HashSet<Character>();
       
       for(int i=0;i<l.length();i++)
       {
    	   h.add(l.charAt(i));
       }
       System.out.println(h+" ");
       
      
	}

}
