package logical;

public class Armstrong {

	public static void main(String[] args) 
	{

		int a=370;
		int b;
		int count=0;
		int z=a;
		double sum=0;
		
		while(a>0)
		{
			b=a%10;
			count++;
			a=a/10;
		}
		
		a=z;
		while(a>0)
		{
			b=a%10;
			sum+=Math.pow(b, count);
			a=a/10;
		}
		if(sum==z)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("not");
		}
		
		
		
	}

}
