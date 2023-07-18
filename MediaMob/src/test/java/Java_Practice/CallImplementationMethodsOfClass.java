package Java_Practice;

public class CallImplementationMethodsOfClass
{
    public static void callingMethod(Interface inter)
    {
    	String result1 = inter.getMethodName();
    	System.out.println(result1);
    	String result2 = inter.getMethodName();
    	System.out.println(result2);
    }
    public static void main(String[] args) {
    	ImplementationOFinterface obj=new ImplementationOFinterface();
    	callingMethod(obj);	
	}
    
}
