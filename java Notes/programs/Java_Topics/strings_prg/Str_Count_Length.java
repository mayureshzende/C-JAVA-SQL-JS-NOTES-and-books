package strings_prg;
import java.util.*;
public class Str_Count_Length {
public static void main(String[] args) {
	String s="windows is operating System";
	System.out.println(CountWords(s));
	
}
static int CountWords(String s)
{
	if(s==null)
		return 0;
	String[] w=s.split(" ");
	System.out.println(Arrays.deepToString(w));
	return w.length;
}

}
