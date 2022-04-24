package Arrays;

import java.util.Arrays;

public class arr_Freq_Ele {

	public static void main(String[] args) {
		int arr[]={1,2,3,1,7,1,3,2,4,5,6,5,5,5,5};
		
		int[] fr=new int[arr.length];
		
		int count=1;
		int visited=-1;
		for(int i=0;i<arr.length;i++)
		{
			count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					fr[j]=visited;			
				}
			}
		if(fr[i]!=visited)
				{
					fr[i]=count;
				}
			}
		System.out.println("original array");
		for(int o:arr)
		System.out.print(o+" ");
		System.out.println();
			System.out.println("---------------------------------------");  
	        System.out.println(" Element |     Frequency");  
	        System.out.println("---------------------------------------"); 
	
		for(int i=0;i<fr.length;i++)
			if(fr[i]!=visited)
			{
				System.out.print(arr[i]+"       is     "+fr[i]+" times \n");
			}
		
	}
}
