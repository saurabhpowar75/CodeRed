 package logical;

public class Pc {

	public static void main(String[] args) 
	{
		int j;
		for(int a=0;a<=100;a++)
		{
			for( j=2;j<=a;j++)
			{
				if(a%j==0)
				{
					break;
				}
			}
			if(a==j)
			{
				System.out.print(j+" ");
			}
		}
    	  
      }
	
		
	

}
