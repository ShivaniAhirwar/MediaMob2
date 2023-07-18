package Java_Practice;

public class ReverseStringWIthoutAffectingSpaces
{
   public static void main(String[] args) {
	
	   String s="Welcome to the world of java";
	   char[] ch=s.toCharArray();
	   
	   char[] changes=new char[ch.length];
	   
	   for(int i=0;i<ch.length;i++)
	   {
		   if(ch[i]==' ')
		   {
			   changes[i]=ch[i];
		   }
	   }
	   int chLength=ch.length-1 ;
	   for(int i=0;i<ch.length;i++)
	   {
		   if(changes[i]!=' ')
		   {
			  if(ch[chLength]==' ')
			  {
				  chLength--;
				  i--;
			  }
			  else
			  {
		       changes[i]=ch[chLength];
		       chLength--;
			  } 
		   }
		   
	   }
	   for(int i=0;i<ch.length;i++)
	   {
		   System.out.print(changes[i]);
	   }	   
}
}
