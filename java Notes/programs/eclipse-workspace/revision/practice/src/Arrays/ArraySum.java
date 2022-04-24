package Arrays;
import java.util.*;

public class ArraySum {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
int [] a=new int[5];
System.out.println("enter the array elements");

for(int i=0;i<a.length;i++)
{
	a[i]=sc.nextInt();
		
}

int res=SumArr(a);
System.out.println("sum is="+res);
}

static int SumArr(int[] a)
{ 
	int sum=0;
	for(int a1:a)
	{
		sum +=a1;
	}
	return sum;
}
}
