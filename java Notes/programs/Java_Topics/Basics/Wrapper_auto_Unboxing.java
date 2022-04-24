package Basics;
import java.util.*;

public class Wrapper_auto_Unboxing {
public static void main(String[] args) {
	Integer i=8;
	System.out.printf("autoboxing -> converting int to Integer= %d \n +++++++++++++++++++++++ \n",i);
	
	
	Integer a=new Integer(80);
	int b=a;
	System.out.println("Unboxing -> converting Integer to int = "+b);
	
}
	
}
