package Java_Practice;

public class DistanceBTwTwoCordinates 
{
	int x;
	int y;

   public DistanceBTwTwoCordinates(int x, int y)
   {
	  this.x=x;
	  this.y=y;
   }

   public static void calculateDistance()
   {
	   DistanceBTwTwoCordinates d1=new DistanceBTwTwoCordinates(2,4);
	   DistanceBTwTwoCordinates d2=new DistanceBTwTwoCordinates(5,8);
	   
	   int dx = d1.x-d1.x;
	   int dy =d1.y-d2.y;
	   
	   double totaldistace = Math.sqrt(dx*dx+dy*dy);
	   System.out.println(totaldistace);
	   
   }
   public static void main(String[] args) {
	  
         	DistanceBTwTwoCordinates.calculateDistance();
	   
	}
}
