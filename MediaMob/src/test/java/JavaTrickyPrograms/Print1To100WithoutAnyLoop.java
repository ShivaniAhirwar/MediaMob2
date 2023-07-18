package JavaTrickyPrograms;

public class Print1To100WithoutAnyLoop
{
	 
   public static void num(int num)
   {
	   if(num<=100)
	   {
		   System.out.println(num);
		   num++;
		   num(num);
	   }
   }
   public static void main(String[] args) {
   
	
	   num(1);
	   
}
}
