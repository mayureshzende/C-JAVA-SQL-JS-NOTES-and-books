import java.io.*;
import java.util.regex.*;

class FileNameExtractor
{
	public static void main(String[] args) throws Exception
	{
		File f=new File("E:\\Languages PRacticee and nots\\TEST dURGA SOFT");
		Pattern p=Pattern.compile("[a-zA-Z0-9_.$]+[.]class");
		int count=0;
		String[] s=f.list();

		for(String s1:s)
		{

			Matcher m=p.matcher(s1);
			if(m.find() && m.group().equals(s1))
			{
				
				++count;
				System.out.println(s1);

			}
		}	
		System.out.println(count);

	}
}