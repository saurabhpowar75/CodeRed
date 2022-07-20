package string;

public class Reverse_each_word {

	public static void main(String[] args) 
	{

		String st="Saurabh Is working in Humancloud";
		
		String words[]=st.split("\\s");
		
		String rev="";
		
		for(String w:words)
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			rev=rev+sb.toString()+" ";
		}
		System.out.println(rev);
		
		
		
		
		
		
		
		
	}

}
