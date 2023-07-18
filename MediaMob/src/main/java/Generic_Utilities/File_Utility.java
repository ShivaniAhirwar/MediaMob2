package Generic_Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class File_Utility
{
	public String getCommonData(String key) throws Throwable
    {
		FileInputStream fs=new FileInputStream("./data/CommonData.Property");
    	Properties p=new Properties();
    	p.load(fs);
    	String data = p.getProperty(key);
   
    	return data;
    }
}
