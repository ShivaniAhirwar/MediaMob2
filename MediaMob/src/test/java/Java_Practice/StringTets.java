package Java_Practice;

public class StringTets 
{
   public static void main(String[] args) {
	
	   int num=010101;
	   int tsnum=num;
	   int count=0;
	   while(tsnum>0)
	   {
		   count++;
		   tsnum=tsnum/10;
	   }
	   boolean flag=false;
	   for(int i=0;i<count;i++)
	   {
		   int rem=num%10;
		   if(rem==1 || rem==0)
		   {
			 flag=true;   
		   }
		   else
		   {
			 flag=false;   
		   }
		   num=num/10;
	   }
	   if(flag)
	   {
		   System.out.println("num. is binary no.");
	   }
	   else
	   {
		   System.out.println("num is not binary no.");
	   }
	   
}
}
