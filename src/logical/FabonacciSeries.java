package logical;

public class FabonacciSeries {

	public static void main(String[] args) 
	{

		//0 1 1 2 3
		
		
		int Fn=1;
		int Sn=0;
		int add;
		
		for(int i=0;i<=5;i++)
		{
			System.out.print(Sn+" ");
			add=Fn+Sn;
			Sn=Fn;
			Fn=add;
		}
		
		
		
		
		
		
		
		
	}

}
