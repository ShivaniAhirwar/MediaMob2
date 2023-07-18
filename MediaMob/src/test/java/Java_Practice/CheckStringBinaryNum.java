package Java_Practice;

public class CheckStringBinaryNum 
{
   public static void number(String number)
   {
	   int count=0;
	   for(int i=0;i<number.length();i++)
	   {
		   if(number.charAt(i)=='0' || number.charAt(i)=='1')
		   {
			   count++;
		   }
	   }
	   if(count==number.length())
	   {
		   System.out.println("Number is binary no.");
	   }
	   else
	   {
		   System.out.println("Number is not binary no.");
	   }
   }
   public static void main(String[] args) {
	   number("101010");
}
}
