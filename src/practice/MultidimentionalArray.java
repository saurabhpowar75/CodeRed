package practice;

import java.util.Iterator;

public class MultidimentionalArray {

	public static void main(String[] args) 
	{
		
		int a[][]= {{2,3,5},{10,20,30}};
		
		for (int i = 0; i < 2; i++) 
		{
			for (int j = 0; j < 2; j++) 
			{
			  System.out.print(a[i][j]+" ");
			}
		}
		System.out.println(" ");
		for (int i = 0; i < 2; i++) 
		{
			for (int j = 0; j < 2; j++) 
			{
				System.out.print(a[i][j]+" ");
			}
		}

	}

}
