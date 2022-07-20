package practice;

public class UpperCaseLowerCase {

	public static void main(String[] args) 
	{
         String s="AutomationTesStingCC";
         
        // char sp[]=s.toCharArray();
         
         String Up="";
         
         String Lo="";
         
         
         for (int i = 0; i < s.length() ; i++) 
         {
        	 
        	 if(Character.isUpperCase(s.charAt(i)))
        	 {
        		Up=Up+s.charAt(i);
        	 }
        	 else
        	 {
         		Lo=Lo+s.charAt(i);
 
        	 }
			
		}
         System.out.println(Up);
         System.out.println(Lo);

	}

}
