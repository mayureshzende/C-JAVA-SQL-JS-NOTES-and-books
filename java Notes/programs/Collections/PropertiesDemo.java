import java.util.*;
import java.io.*;

class PropertiesDemo
{
	public static void  main(String[] args) throws Exception 	
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("abc.properties");

		p.load(fis);

		System.out.println(p);


		String s=p.getProperty("mayur");
		System.out.println(s); 	


		p.setProperty("mayur","Football777");

		FileOutputStream fos=new FileOutputStream("abc.properties");

		p.store(fos,"updated the entry for password feild");
	}
}