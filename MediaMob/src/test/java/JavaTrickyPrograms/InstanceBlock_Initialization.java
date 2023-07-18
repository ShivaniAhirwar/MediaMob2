package JavaTrickyPrograms;

public class InstanceBlock_Initialization 
{
	static {
    	System.out.println("Static block-----------");
    }
    
    {
         System.out.println("Instance initialize block");	
    }
    
    InstanceBlock_Initialization()
    {
    	System.out.println("Class constructor");
    }
    public static void main(String[] args) {
    	InstanceBlock_Initialization i=new InstanceBlock_Initialization();
		System.out.println("main method--------");
	}
}
