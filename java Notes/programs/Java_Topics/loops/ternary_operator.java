package loops;
import java.util.*;
public class ternary_operator {
public static void main(String[] args) {

	System.out.println((2>3)?"true":"flase");
int year=1600;
	if(((year%4==0) && (year % 100!=0)) || (year % 400 == 0))
	{
		System.out.println("leap year");
	}
	else
	{
		System.out.println(" not leap year");
	}
}


}
