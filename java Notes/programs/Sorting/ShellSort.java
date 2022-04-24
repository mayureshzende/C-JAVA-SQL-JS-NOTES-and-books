package Ds.Algo.Sorting;

public class ShellSort {
public static void main(String[] args) {
	
	int[] arr= { 20, 30 ,-15,7 ,55 ,1,-22}; // length is 7 
	//System.out.println(arr.length);
	
	
	for (int gap=arr.length/2;gap>0; gap /=2)
	{
		for (int i=gap;i<arr.length;i++)
		{			
			int newElement=arr[i];			
			
			int j=i;			
			
			while( j >= gap && arr[ j - gap ] > newElement)
			{
				arr[j]=arr[j-gap];
				j -=gap;
			}
			arr[j]=newElement;
		}
		
	}
	
	for(int i: arr)
	{
		System.out.println(i);
	}
	
}
}
