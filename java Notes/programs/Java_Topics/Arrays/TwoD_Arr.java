package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class TwoD_Arr 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the row size");
	int n=sc.nextInt();
	System.out.println("enter the column size");
	int m=sc.nextInt();

	int[][] arr=new int[n][m];
for(int i=0;i<arr.length;i++)
{
	arr[i]=new int[m];
	
	for(int j=0;j<arr.length;j++)
	{
		System.out.printf("Enter the element for %d row and %d cloumn ",i,j ,"\n");
		arr[i][j]=sc.nextInt();
	}
}
//	for(int i=0;i<arr.length;i++)
//	{
//		for(int j=0;j<arr.length;j++) {
//			System.out.print(arr[i][j]+" ");
//		}
//		System.out.println();
//	}
for(int i=0;i<arr.length;i++)
{
	System.out.println(Arrays.toString(arr[i]));
}
sc.close();	
}
}
