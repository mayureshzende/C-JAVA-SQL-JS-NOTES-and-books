package Arrays;
import java.util.*;
public class Copy_Arr {
public static void main(String[] args) {
	char[] c= {'i','n','d','i','a',' ','i','s',' ','b','e','s','t'};

	System.out.println("original array \n "+Arrays.toString(c));
	char cpy[]=Arrays.copyOfRange(c, 0, 5);
	
	for(int i=0;i<=cpy.length;i++)
		System.out.println(cpy);
}
}
