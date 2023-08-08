package Generic_Utilities;

import POM_Admin.LoginAsSuperAdmin;

public class CallUser extends BaseClass
{
	WebDriver_Utility webLib=new WebDriver_Utility();
	public static void callMobber() throws Throwable
	{
		WebDriver_Utility webLib=new WebDriver_Utility();
		   File_Utility filLib=new File_Utility();
	  	    String email = filLib.getCommonData("Email");
	  	    String Password = filLib.getCommonData("Password");

	  	  webLib.implicitlywait(driver);
	  	webLib.maximizeScreen(driver);

LoginAsSuperAdmin login=new LoginAsSuperAdmin(driver);
login.loginSuperAdmin(email,Password );	
	}
	public static void callSuperAdmin() throws Throwable
	{
		WebDriver_Utility webLib=new WebDriver_Utility();
		   File_Utility filLib=new File_Utility();
	  	    String email = filLib.getCommonData("SuperAdminEmail");
	  	    String Password = filLib.getCommonData("SuperAdminPassword");

	  	  webLib.implicitlywait(driver);
	  	webLib.maximizeScreen(driver);

LoginAsSuperAdmin login=new LoginAsSuperAdmin(driver);
login.loginSuperAdmin(email,Password );
	}
}
