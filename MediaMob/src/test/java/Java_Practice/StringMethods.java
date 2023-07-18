package Java_Practice;

public class StringMethods
{
   public static void main(String[] args) 
   {
	   String str = "Java Program";
	// Combining two strings
	String str1 = String.format("The value of string is %s", str);
	// Outputs float number upto 10 decimal places
	String str2 = String.format("The value of float is %.10f", 23.73925);
	// Outputs float number with 14 digits before the decimal point and 3 after it.
	String str3 = String.format("The value of float2 is %14.3f", 23.73925);
	// Printing the formatted strings
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	
	String f="shi vani";
	String g="vanishka";
	String con = g.substring(0, 4);
	boolean result = f.contains(con);
	System.out.println(con);
    System.out.println(result);
	
    
	
   }
}
