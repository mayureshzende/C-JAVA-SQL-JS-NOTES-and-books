package Ds.Algo.Sorting;
// it has the time complexity of O(n x n)
public class BubbleSort 
{
public static void main(String[] args) {
	
	int[] arr= {20,35,-15,7,55,1,-22};
	
	for(int laststart=arr.length-1;laststart>0;laststart--)
	{
		for(int i=0;i<laststart;i++)
		{
			if(arr[i]>arr[i+1])
			{
				swap(arr,i,i+1);
			}
		}
		System.out.println();
	}
	for(int a:arr)
	{
		System.out.println(a);
	}
}
	public static void swap(int[] arr,int i,int j)
   {		
		if(i==j)
			{
				return;
			}
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
   }
}
