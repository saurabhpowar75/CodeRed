package string;

public class FindDuplicateChar {

	public static void main(String[] args) 
	{
           String sp="ggttuioll";
           
           //int len=sp.length();
           
           char [] po=sp.toCharArray();
           
           for(int i=0;i<po.length;i++)
           {
        	   for(int j=i+1;j<po.length;j++)
        	   {
        		   if(po[i]==po[j])
        		   {
        			   System.out.print(po[j]);
        			  
        		   }
        	   }
           }
	}

}
