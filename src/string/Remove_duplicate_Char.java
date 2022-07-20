 package string;

public class Remove_duplicate_Char {

	public static void main(String[] args) 
	{
      String s="BHyttrrooll";
      
      
      StringBuilder s1=new StringBuilder();
      
      s.chars().distinct().forEach(c->s1.append((char)c));
      System.out.println(s1);
	}

}
