package Arrays;
import java.util.Arrays;

public class arr_Sum 
{

	static int arr_sum(int[] a)
	{
	int sum=0;
	
	for(int e:a)
		sum +=e;
	
	return sum;
	}
	
	public static void main(String[] args) 
	{
	int[] arr= {1,2,3,4,5};
	System.out.println(arr_sum(arr));
	}
}
