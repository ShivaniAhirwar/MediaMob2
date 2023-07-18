package Java_Practice;

public class ZeroOne
{
   public static void main(String[] args) 
   {
	   int[] arr= {1,0,1,0,0,0,1,1,1,0};
	   int[] array=new int[arr.length];
	   int m=0;
	   int n=arr.length-1;
	   for(int i=0;i<arr.length;i++)
	   {
		   if(arr[i]==1)
		   {
			   array[m]=arr[i];
			   m++;
		   }
		   else
		   {
			   array[n]=arr[i];
			   n--;
		   }
	   }
	   for(int i=0;i<arr.length;i++)
	   {
		   System.out.print(array[i]);
	   }
}
}
