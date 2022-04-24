package Arrays;
import java.util.*;

public class Two_D_array_Add {
public static void main(String[] args) {
	int[][] arr={{1,2,3},{3,4,5}};
	int[][] arr2={{1,2,3},{3,4,5}};
	int add[][]=new int[2][3];
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			add[i][j]=arr[i][j]+arr2[i][j];
		}
	}
	System.out.println("Addition is");
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			System.out.print(add[i][j] +
					" ");
		}
	System.out.println();  
	}
}
}
