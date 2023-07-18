package Java_Practice;

public class Program_1 
{
      public static void main(String[] args) {
		
//    	String s1="true";
//    	String s2="test1";
//    	String s3="test3";
//    	boolean a1 = Boolean.parseBoolean(s1);
//    	boolean a2 = Boolean.parseBoolean(s2);
//    	boolean a3 = Boolean.parseBoolean(s3);
//    	System.out.println(a1);
//    	System.out.println(a2);
//    	System.out.println(a3);
    	
    	  String s="testitng";
    	  char[] ch=s.toCharArray();
    	  
    	for(int i=0;i<ch.length;i++)
    	{
    		int count=1;
    		for(int j=i+1;j<ch.length;j++)
    		{
    			if(ch[i]==ch[j])
    			{
    				count++;
    			}
    		}
    		if(count>=2)
    		{
    			System.out.println(ch[i]);
    		}
    	}
    	
    	
	}
}
