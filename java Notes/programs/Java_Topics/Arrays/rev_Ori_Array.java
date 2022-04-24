package Arrays;
import java.util.*;

public class rev_Ori_Array {

	static void rev_Arr(int[] a)
	{
		System.out.println("reverse of array is");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("enter the vlaue for location "+ i + "\n");
			arr[i]=sc.nextInt();
		}
		rev_Arr(arr);
	}
}
