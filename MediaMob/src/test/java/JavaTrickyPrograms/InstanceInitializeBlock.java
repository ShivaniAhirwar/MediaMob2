package JavaTrickyPrograms;

/*
 * Will Instance Initialize Block execute without creating object of the class in main method?
 * No, it will execute only if we have created object of the class.
 */

public class InstanceInitializeBlock 
{
    static {
    	System.out.println("Static block-----------");
    }
    
    {
         System.out.println("Instance initialize block");	
    }
    
    InstanceInitializeBlock()
    {
    	System.out.println("Class constructor");
    }
    public static void main(String[] args) {
		System.out.println("main method--------");
	}
}
