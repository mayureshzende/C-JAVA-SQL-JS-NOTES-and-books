package strings_prg;
import java.util.*;

public class StrTest {
public static void main(String[] args) {
	String s="Mayuresh Zende";
	System.out.println("hasscoded before string is="+s.hashCode());
	System.out.println(s.substring(8));
	System.out.println(s.substring(0 , 8));
	System.out.println(s.replace("Mayuresh","Mayur"));
	s=s+"esh";
	System.out.println("hasscoded after string is="+s.hashCode());
	System.out.println(s);
	int a=10;
	String s1=String.valueOf(a);
	System.out.println(s1+10);
	
	StringBuffer sb=new StringBuffer("Rolnaldo");
	sb=sb.append("is");
	System.out.println("hashcode main of sbuffer is="+sb.hashCode());
	System.out.println(sb.append(" cr 7"));
	System.out.println("hashcode of after change sbuffer is="+sb.hashCode());
	System.out.println(sb);
	System.out.println(sb.insert(0,"cristiano "));
	System.out.println(sb.replace(0, 2,"CR"));
	
	System.out.println(s.contains("Mayur"));
	
 }
}
