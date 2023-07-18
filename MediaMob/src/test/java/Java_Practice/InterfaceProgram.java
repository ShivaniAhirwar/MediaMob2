package Java_Practice;

interface Parents
{
	void p1();
	void p2();
	void p3();
}
interface Child1 extends Parents
{
	public void p1();
	public void c2();
	public void c3();
	
}

class Program implements Child1
{
	
	public void p2() {
		// TODO Auto-generated method stub
		
	}

	public void p3() {
		// TODO Auto-generated method stub
		
	}

	public void c3() {
		// TODO Auto-generated method stub
		
	}

	Program()
	{
		System.out.println("Default constructor!");
	}
 
	public void p1() {
		System.out.println("C1 method");
		
	}

	public void c2() {
		
		System.out.println("C2 method");
	}
	
}
public class InterfaceProgram 
{
	InterfaceProgram()
	{
	      	super();
	}
	public static void main(String[] args)
	{
		Program p=new Program();
		p.p2();
		
	}
}
