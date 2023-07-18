package Java_Practice;

public class AddTwoDifferentArray 
{
    public static void main(String[] args) {
		 int[] array1= {1,0,1,4,5,6};
		 int[] array2= {2,5,7,7};
		 int[] array3=new int[Math.max(array1.length, array2.length)];
		 for(int i=0;i<array2.length;i++)
		 {
			 array3[i]=array1[i]+array2[i];
			
		 }
		 for(int i=0;i<array3.length;i++)
		 {
			 if(array3[i]==0)
			 {
				 array3[i]=array1[i];
			 }
		
		 }
		 for(int j=0;j<array1.length;j++)
		 {
			 System.out.print(array3[j]);
		 }
	}
}
