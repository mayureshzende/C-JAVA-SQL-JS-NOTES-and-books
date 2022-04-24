import java.io.*;
import java.util.regex.*;

class MobileNumberEx
{
	public static void main(String[] args) throws Exception 
	{
	
		PrintWriter out=new PrintWriter("output.txt");

		Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
	
		BufferedReader br=new BufferedReader(new FileReader("input.txt"));
	
		String line=br.readLine();
	
		while(line!=null) //check if the file is not null
		{
			Matcher m=p.matcher(line); // if not null create the matcher object
			while(m.find()) // find the matching objct in the file
			{ 
				out.println(m.group());	// write the matching group in the file
			}
			line =br.readLine(); // read the line in the input.txt
		}

		out.flush();


	}

}