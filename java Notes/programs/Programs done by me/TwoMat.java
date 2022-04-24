import java.util.*;
class TwoMat
{
	public static void main(String[] args)
	{
		int[][] arr1={{1,2,3},{1,2,3},{1,2}};
		int[][] arr2={{1,2,3},{1,2,3},{1,2}};

		for(int i=0; i<arr1.length ; i++)
		{
			for(int j=0 ; j<arr1[i].length ; j++ )
			{
				System.out.print(arr1[i][j]+ " ");		
			}
			System.out.println();
		}
		System.out.println();

		int[][] res=new int[arr1.length][3];

		for( int i=0; i<arr1.length ; i++)
		{
			for(int j=0; j < arr1[i].length ; j++)
			{
				res[i][j] = arr1[i][j] +  arr2[i][j];
			}
		}

		for( int i=0 ; i< res.length ; i++ )
		{
			for(int j=0 ; j < res[i].length ; j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}