package Java_Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program_2 {
  
	public static void test()
	{
		 int a=12;
	}
	public static void main(String[] args) throws Throwable {
		
		String sDate="26/05/2023";
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
		System.out.println(sDate+"/t"+date);
		
		System.out.println();
	}
	
}
