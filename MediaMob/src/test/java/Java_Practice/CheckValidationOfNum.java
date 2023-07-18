package Java_Practice;

class AnyNum
{
	
	public static boolean isnumValid(String number)
	{
		try {
		Long.parseLong(number);
		return true;
		}
		catch(NumberFormatException n)
		{
			System.out.println("no. is not valid");
			return false;
		}
	}
}
class PhoneNo
{
	public static boolean isPhoneNumValid(String Number)
	{
		if(Number.length()==10 && AnyNum.isnumValid(Number))
		{
		Long.parseLong(Number);
		System.out.println("Phone Number is valid"+" "+Number);
		return true;
		}
		else
		{
			System.out.println("Phone no. is not valid"+" "+Number);
			return false;
		}
		
	}
}
public class CheckValidationOfNum
{
     public static void main(String[] args) {
		System.out.println(AnyNum.isnumValid("12345"));
		System.out.println(PhoneNo.isPhoneNumValid("9876543234"));
	}
}
