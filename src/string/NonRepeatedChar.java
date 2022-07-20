package string;

public class NonRepeatedChar {

	public static void main(String[] args) 
	{

		String s="teeter";
		
		for(char i:s.toCharArray())
		{
			if(s.indexOf(i)==s.lastIndexOf(i))
			{
				System.out.println(i);
				break;
			}
		}
		
		
	}

}
