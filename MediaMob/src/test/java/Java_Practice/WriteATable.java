package Java_Practice;

public class WriteATable 
{
	
	static int multiply;
    public static void tableMethod(int num)
    {
        
    	for(int i=1;i<=10;i++)
    	{
    		multiply=num*i;
    		System.out.print(multiply+" ");
    		
    	}
    	System.out.println(" ");
    }
    public static void main(String[] args) {
    	tableMethod(2);	
    	tableMethod(3);
    	tableMethod(9);
    	tableMethod(13);
	}
}
