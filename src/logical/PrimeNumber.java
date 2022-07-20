package logical;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		
		int a=8;
		int count=0;
       for(int i=1;i<=a;i++)
       {
    	   if(a%i==0)
    	   {
    		   count++;
    	   }
       }
       if(count==2)
       {
    	   System.out.println("Number Is Prime");
       }
       else 
       {
    	   System.out.println("Number is not Prime");
       }
	}

}
