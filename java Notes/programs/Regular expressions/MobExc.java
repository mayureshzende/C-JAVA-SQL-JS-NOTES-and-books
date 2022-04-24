import java.util.*;
import java.util.regex.*;
import java.io.*;

class MobExc
{
	public static void main(String[] args) throws Exception
	{
		PrintWriter pw=new PrintWriter("output.txt");
		BufferedReader br=new BufferedReader(new FileReader("input.txt"));
		Pattern p=Pattern.compile("([+]?(0|91)?[7-9][0-9]{9} | [a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z0-9]+)+)");  // for mobile number [+]?(0|91)?[7-9][0-9]{9}

		String line=br.readLine();

		while(line!=null)
		{
			Matcher m=p.matcher(line);
			while(m.find())
			{
				pw.print(m.group()+ " --  ");
			}	
			pw.println();
			line=br.readLine();
		}
		pw.flush();
	}
}
