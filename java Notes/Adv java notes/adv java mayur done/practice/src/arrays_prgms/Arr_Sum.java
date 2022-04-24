package arrays_prgms;

import java.util.*;

public class Arr_Sum {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int[] arr=new int[5];
	System.out.println("\n enter the array elements=");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	
	int res=sum(arr);
	System.out.println("\n the sum of array elements is="+res);
}

public static int sum(int[] arr) 
{
	int s=0;
for(int i:arr) {	
	s=s+i;
}
return s;
}
}
