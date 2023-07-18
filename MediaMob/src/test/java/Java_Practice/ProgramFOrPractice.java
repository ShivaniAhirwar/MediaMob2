package Java_Practice;

public class ProgramFOrPractice {
   
	static int fact=1;
	public static int numberFact(int Num)
    {
       	fact=fact*Num;
       	newNum(Num);
       	return Num;
       	
    }
	public static int newNum(int Number)
	{
		Number=Number-1;
		if(Number>0)
		{
		numberFact(Number);
		}
		return Number;
		
	}
	
	public static void main(String[] args)
	{
		numberFact(3);  	
		System.out.println(fact);
	}
}
