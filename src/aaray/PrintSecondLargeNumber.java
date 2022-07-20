package aaray;

public class PrintSecondLargeNumber {

	public static void main(String[] args) 
	{
         int a[]= {10,8,25,55,9,80};
         
         int h= Integer.MIN_VALUE;
         int sh= Integer.MIN_VALUE;
         
         for (int i = 0; i < a.length; i++) 
         {
			if(a[i]>h)
			{
				sh=h;
				h=a[i];
			}
			if(a[i]<h && a[i]>sh)
			{
				sh=a[i];
			}
		}
         System.out.println(sh);
         
         
         
	}

}
