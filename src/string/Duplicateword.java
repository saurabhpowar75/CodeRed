package string;

public class Duplicateword {

	public static void main(String[] args) 
	{
        String op="shaka laka boom boom boom";
        
        String []s=op.split(" ");
        
    	int count=1;

        
        for(int i=0;i<s.length;i++)
        {  
        	for(int j=i+1;j<s.length;j++)
        	{
        		if(s[i].equals(s[j]))
        		{
                    count++;
                    s[j]="0";
        		}
        		
        	}
        
        	if((count>1) && (s[i]!="0")) {
        		System.out.println(s[i] +":"+ count);
        	}
        }
        
	}}
	


