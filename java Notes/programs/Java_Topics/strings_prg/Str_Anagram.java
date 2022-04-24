package strings_prg;
import java.util.*;
public class Str_Anagram {
public static void main(String[] args) {
	String s1="aabbccdd";
	String s2="abbacddc";
	
	System.out.println(isAnagram(s1,s2));
	
}
static boolean isAnagram(String s1,String s2)
{
	if(s1.length()!=s2.length())
		return false;
	for(int i=0;i<s1.length();i++)
	{
		char ch=s1.charAt(i);
		if(s2.contains(""+ch))
		{
			//s2=s2.replaceFirst("",+ch, "");
		s2 =s2.replaceFirst(""+ch,"");
		}
		else 
		{
			return false;
		}
	}
	
	return s2.isEmpty();
}
}
