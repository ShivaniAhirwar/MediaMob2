package Java_Practice;

public class CheckNumberIsBinaryNo 
{
   public static void main(String[] args)
   {
	   boolean flag=true;
	   int Number=11111111;
	   while(Number!=0)
	   {
		   int rem = Number%10;
		   if(rem>1)
		   {
			   flag=false;
			   break;
		   }
		   else
		   {
			   Number=Number/10;
		   }
	   }
	   if(flag)
	   {
		   System.out.println("Num is binary no.");
	   }
	   else
	   {
		   System.out.println("Num is not binary no.");
	   }
	   
   }
}
