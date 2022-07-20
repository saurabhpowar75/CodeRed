package aaray;

import java.util.ArrayList;

public class LambadaEx {

	public static void main(String[] args) 
	{

		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		for(int i=1;i<=100;i++)
		{
			a1.add(i);
		}
		
		a1.forEach((val)->
		{
			System.out.println(val);
		});
		
		
		
		
		
		
		
		
		
	}

}
