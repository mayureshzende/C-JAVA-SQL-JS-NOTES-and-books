import java.util.regex.*;
import java.util.*;

class RegexMobNum
{
  public static void main(String[] args) {
		
		Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
		Matcher m=p.matcher(args[0]);

			if(m.find() && m.group().equals(args[0]))	
			{
				System.out.println("valid number");
			}
			else
			{
				System.out.println("invalid number");
			}

	}
}


/** 
for checking  the mail ID simply substitue the mail id Regular Expression instead of the mobile number expression


*/

