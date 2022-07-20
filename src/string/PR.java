package string;


public class PR {

	public static void main(String[] args)
	{
        
		String st="Dum Dum Diga Diga";
		
		String []sp=st.split(" ");
		
		int count=0;
		
		for (int i = 0; i < sp.length; i++) 
		{
			for (int j = i+1; j < sp.length; j++) 
			{
				if(sp[i].equals(sp[j])) 
				{
				count++;
				sp[j]="0";
				}
			}
			
			if((count>=1)&&(sp[i]!="0"))
			{
				System.out.println(sp[i]);
			}
		}
		
		
	}

}
