package JavaTrickyPrograms;

public class DoubleMInNum
{
    /**
     * Which one in minimum no. Double Min_value or 0.0.?
     * Bigger no. out of Double Min_Value or negative value.?
     * Bigger no. out of Double Min_Vlaue or Negative_Infinity?
     * 
     */
	
	public static void main(String[] args) {
		
		System.out.println(Double.MIN_VALUE);
		System.out.println(Math.min(Double.MIN_VALUE, 0.0));
		System.out.println(Math.min(Float.MIN_VALUE, 0.0));
	}
}
