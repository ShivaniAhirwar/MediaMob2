package Java_Practice;

public class PalandromeProgram {
      
	static int num=146641;
	static int tnum=num;
	static int revNum=0;
	static int reverse()
	{
	    int rem=num%10;  
	    return rem;
	}
	static void NewNum(int n)
	{
	     revNum=revNum*10+n;
	     
	}
	public static void main(String[] args) {
		
		while(num>0)
		{
		int rem1 = reverse();
		NewNum(rem1);
		num/=10;
		}
	 if(tnum==revNum)
	 {
		 System.out.println(revNum+"=No. is palandrome");
	 }
	 else
	 {
		 System.out.println(revNum+"=No. is not a palandrome no.");
	 }
	
	}
}
