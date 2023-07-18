package Java_Practice;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Anagram 
{
     public static void main(String[] args) 
     {
	      
	     String s="race es";
	     String a="care se";
	     
	     if(s.length()==a.length())
	     {
	    	 char[] s1=s.toCharArray();
	    	 char[] a1=a.toCharArray();
	    	 
	    	  Arrays.sort(s1);
	    	 Arrays.sort(a1);
	   
	    	 boolean result = Arrays.equals(s1, a1);
	    	 if(result)
	    	 {
	    		 System.out.println(s+" and "+a+" are anagram");
	    	 }
	    	 else
	    	 {
	    		 System.out.println(s+" and "+a+" are not anagram");
	    	 }
	     }
	     
	}
}
