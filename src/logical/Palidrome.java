package logical;

public class Palidrome {

	public static void main(String[] args) 
	{
        int a=12321;
        int b;
        int c=0;
        int z=a;
        
        
        while(a>0)
        {
        	b=a%10;
        	c=(c*10)+b;
        	a=a/10;
        }
        if(c==z)
        {
        	System.out.println("Palidrome");
        }
        else
        {
        	System.out.println("Not");
        }
	}

}
