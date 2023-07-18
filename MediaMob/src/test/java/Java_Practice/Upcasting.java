package Java_Practice;

class Parent
{
	public void p1()
	{
		System.out.println("parent method");
	}
}
class Child extends Parent
{
	public void c1()
	{   
		
		System.out.println("child method");
	}
}
class GrandChild extends Child
{
	public void gc1()
	{
		super.p1();
		super.c1();
		System.out.println("grandchild method");
	}	
}
class Unknown extends GrandChild
{
	public void unknown()
	{
		System.out.println("unknown method");
	}
}
public class Upcasting 
{
     public static void main(String[] args) 
     {
    	 GrandChild c=new GrandChild();
       c.gc1();
       
	}
}
