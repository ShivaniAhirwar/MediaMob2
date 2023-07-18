
import Java_Practice.Interface;

public class InhetitanceIterface 
{
   public static void implementedMethod(Interface inter)
   {
	   String result = inter.getMethod();
	   System.out.println(result);
   }
   public static void main(String[] args) {
	   ImplementationOFinterface obj=new ImplementationOFinterface();
	   implementedMethod(obj);
   }
}

