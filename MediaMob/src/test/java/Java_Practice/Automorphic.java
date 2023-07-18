package Java_Practice;

public class Automorphic {
  
	public static void main(String[] args) {
		
		int num=76;
		int originalNum=num;
		int squareNum =(int) Math.pow(num, String.valueOf(num).length());
		int lastTwoNum=0;
		int reverseLastTwoNum=0;
	System.out.println(squareNum);
		for(int i=0;i<String.valueOf(num).length();i++)
		{
			int rem=squareNum%10;
			lastTwoNum=lastTwoNum*10+rem;
			squareNum=squareNum/10;
		}
		for(int i=0;i<String.valueOf(num).length();i++)
		{
			int rem=lastTwoNum%10;
		reverseLastTwoNum=reverseLastTwoNum*10+rem;
		lastTwoNum=lastTwoNum/10;
		}
		if(reverseLastTwoNum==originalNum)
		{
			System.out.println(originalNum+"=num is automorphic");
		}
		else
		{
			System.out.println(originalNum+"=num is not automorphic");	
		}
		
	}
}
