import java.util.regex.*;
import java.io.*;

class FileNameExc
{
	public static void main(String[] args)
	{
		int count=0;
		Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_$.]*[.]java");

		File f=new File("E:\\Languages PRacticee and nots\\TEST dURGA SOFT\\Reg");

		String[] s=f.list();

		for(String s1:s)
		{
			Matcher m=p.matcher(s1);
			while(m.find() && m.group().equals(s1))
			{
				count++;
				System.out.println(s1);
			}
		}
		System.out.println(" the count is "+ count);
	}
}