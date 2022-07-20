package aaray;

public class LargestNumber {

	public static void main(String[] args) 
	{
        int a[]= {10,8,25,55,9,80};
        
        int mn=a[0];
        
        
        for (int i = 0; i < a.length; i++) 
        {
        	if(a[i]>mn)
        	{
        		mn=a[i];
        	}
		}
       System.out.println(mn);

	}

}
