package Java_Practice;

public class FactorialBYRecussiveMethod
{
	static int fact=1;
	static int num=10;
    static int factorial()
    {
    	fact=fact*num;
    	FactorialBYRecussiveMethod p=new FactorialBYRecussiveMethod();  			
    	p.decrement();
    	return num;
    }
    void decrement()
    {
    	num=num-1;
    	if(num>0)
    	{
    	factorial();
    	}
    }
  public static void main(String[] args) {  
          
      factorial();
	  System.out.println(fact);
   }  
}
