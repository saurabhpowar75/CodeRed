package string;

public class Pallidrome {

	public static void main(String[] args) 
	{
       String st="racecar";
       String Rev="";
       String Org=st;
       
       for(int i=st.length()-1;i>=0;i--)
       {
    	  Rev=Rev+st.charAt(i); 
       }
       System.out.println(Rev);
       
       if(Org.equals(Rev))
       {
    	   System.out.println("Palidrome");
       }
       else
       {
    	   System.out.println("Not");
       }
	}

}
