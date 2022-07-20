package string;

public class RepeatedChar {

	public static void main(String[] args) 
	{
         String dp="ddffgghhuio";
         
         char []s=dp.toCharArray();
         
         
         for(int i=0;i<s.length;i++)
         {
        	 for (int j=i+1;j<s.length;j++)
        	 {
        		 if(s[i]==s[j])
        		 {
        			 System.out.print(s[j]);
        		 }
        	 }
         }
	}

}
