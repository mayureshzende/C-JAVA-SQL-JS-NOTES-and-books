package Ds.Algo.Sorting;

public class Selection_Sort {
public static void main(String[] args)
{
	int[] arr= {20,35,-15,2,5,55,-22};	
	
	
	for(int firstUnsortedindex=arr.length-1;firstUnsortedindex>0;firstUnsortedindex--) // here we start with the last element in the array 
	{
		int largest=0; // setting the first element as the largest 
		for(int i=1;i<=firstUnsortedindex;i++) //starting from the first location 
		{
			if(arr[i]>arr[largest]) // comparing the previous element is greater than the selected element 
			{
			largest=i; // if current element is greater than setting it as largest
			}
		}
	swap(arr,largest,firstUnsortedindex);
	}
	for(int i:arr)
	{
		System.out.println(i);
	}
}
public static void swap(int[] arr,int largest,int lastsortedindex )
{
	int temp=0;
	
	if(arr[lastsortedindex]==arr[largest])
	{
		return;
	}
	
	temp=arr[lastsortedindex];
	arr[lastsortedindex]=arr[largest];
	arr[largest]=temp;
}
}
