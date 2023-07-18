package Java_Practice;

public class Armstrong
{
   public static void main(String[] args)
   {
	    int num=153;
	    int tNUm=num;
	    int count=String.valueOf(num).length();
	    int sumFact=0;
	    while(num>0)
	    {
	    	int rem=num%10;
	    	int power =(int) Math.pow(rem, count);
	    	num=num/10;
	    	sumFact=sumFact+power;
	    }
	   
	    if(sumFact==tNUm)
	    {
	    	System.out.println("No. is armstrong no.="+sumFact);
	    }
	    else
	    {
	    	System.out.println("No. is not armstrong no.="+sumFact);
	    }
   }
}
