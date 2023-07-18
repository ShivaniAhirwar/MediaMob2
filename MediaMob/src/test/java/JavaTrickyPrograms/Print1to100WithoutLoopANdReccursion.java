package JavaTrickyPrograms;

import java.util.BitSet;

public class Print1to100WithoutLoopANdReccursion {

	public static void main(String[] args) {
	
		 String s = new BitSet() {{set(1,100);}}.toString();
	   System.out.append(s, 1, s.length());
	}
}
