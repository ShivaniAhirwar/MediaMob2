package Java_Practice;

public class Xylem_Phelom 
{
  public static void main(String[] args) {
	
	int a=1234;
    int num=a;
	int endDigits=0;
	int middleDigits=0;
	
//	endDigits=endDigits+a%10;
//	a=a/10;
//
//	while(String.valueOf(a).length()-1>0)
//	{
//		
//		middleDigits=middleDigits+a%10;
//		a=a/10;
//	}
//	endDigits=endDigits+a;	
//	if(endDigits==middleDigits)
//	{
//		System.out.println("Number is xylem.");
//	}
//	else
//	{
//		System.out.println("Number is not xylem number.");
//	}
	
// Method Seconds.
	while(a!=0)
	{
		if(a==num ||a<10 )
		{
			endDigits=endDigits+a%10;
		}
		else
		{
			middleDigits=middleDigits+a%10;
		}
		a=a/10;
	}
	
	if(endDigits==middleDigits)
	{
		System.out.println("Number is xylem.");
	}
	else
	{
		System.out.println("Number is not xylem number.");
	}
	
}
}
