package JavaTrickyPrograms;


/*
 * How to create object outside of the class if we make constructor as private.
 * 
 */
public class ConstructorAsPrivate 
{
   
	int age;
	private ConstructorAsPrivate()
	{
		age=21;
		System.out.println(age);
	}
	
	public static void callerTest()
	{
		ConstructorAsPrivate ct=new ConstructorAsPrivate();
		System.out.println("Calling constructor");
	}
	public static void main(String[] args) {
		ConstructorAsPrivate c=new ConstructorAsPrivate();
	}
	
}
class Caller
{
	public static void classerMethod()
	{
	  ConstructorAsPrivate.callerTest();
	
	}
}