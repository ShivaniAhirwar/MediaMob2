package Java_Practice;

public class RightAngleTriangle 
{
   public static void main(String[] args) 
   {
	 
	    double hypotenous=16;
	    double perpendicular=0;
	    double base=10;
	    
	    if(hypotenous==0)
	    {
	    	hypotenous=Math.sqrt(base*base+perpendicular*perpendicular);
	    	System.out.println(hypotenous);
	    }
	    else if(base==0)
	    {
	    	base=Math.sqrt(hypotenous*hypotenous-perpendicular*perpendicular);
	    	System.out.println(base);
	    }
	    else if(perpendicular==0)
	    {
	    	perpendicular=Math.sqrt(hypotenous*hypotenous-base*base);
	    	System.out.println(perpendicular);
	    }
	   System.out.println("=====================================");
	   
}
}
