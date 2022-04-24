package strings_prg;
import java.util.*;
public class Str_CharCount {
public static void main(String[] args) {
	String s="India is My Country and is best in World";
	System.out.println(charCount(s,'M'));
	}
static int charCount(String s,char c)
{
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)==c)
		{
			count++;
		}
	}
	return count;
	
}
}

