import java.util.*;
import java.util.regex.*;

class RegSplit
{
	public static void main(String[] args)
	{
		Pattern p=Pattern.compile("[Ii]");
		String[]  m=p.split("India Is Great");

		for(String s:m)
			System.out.println(s);
		
	}
}