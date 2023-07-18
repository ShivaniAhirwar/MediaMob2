package Java_Practice;
 
public class UniqueCharaceterInString
{
	public static void main(String[] args) {
	    
	     
	    String s = "javaprogramming";
	    String uniqueChars = "";

	    for (int i = 0; i < s.length(); i++)
       {
	        char currentChar = s.charAt(i);
	        boolean isUnique = true;
	        for (int j = 0; j < s.length(); j++) {
	            if (i != j &&currentChar == s.charAt(j)) {
	                isUnique = false;
	                break;
	            }
	        }
	        if (isUnique) {
	            uniqueChars += currentChar;
	        }
	    }

	    System.out.println("Unique characters in the string: " + uniqueChars);
	 
	}
	//jvpoin
}