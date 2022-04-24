package strings_prg;
import java.util.*;
public class Str_Chr_Count {
public static void main(String[] args) {
	String s="I will Be the Best";
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)!=' ')
		{
			count++;
		}
	}
System.out.println("count is "+count);
System.out.println(s.length());
}

}
