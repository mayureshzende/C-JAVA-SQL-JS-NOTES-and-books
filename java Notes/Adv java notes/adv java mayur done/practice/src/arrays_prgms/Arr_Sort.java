package arrays_prgms;
import java.util.*;

public class Arr_Sort {
public static void main(String[] args) {
	//Scanner sc=new Scanner(System.in);
	int arr[]= {2,3,67,57,4,9,11,55};
	System.out.println("before sorting array="+Arrays.toString(arr));

	 int[] sot=Sort_Arr(arr);

	System.out.println("after sorting"+Arrays.toString(sot));
	
}
static int[] Sort_Arr(int[] a)
{
	int temp=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++) 
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	return a; 
	
}
}
