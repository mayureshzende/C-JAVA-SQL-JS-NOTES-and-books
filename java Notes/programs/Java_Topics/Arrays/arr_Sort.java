package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class arr_Sort {
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);

	int[] arr= {3,2,1,4,7,5,6};
	System.out.println(Arrays.toString(arr));
	int ch;
	int t=0;
char d=0;
do {
	 System.out.println("enter the choice how you have to sort \n 1)Ascending  \n 2)Descending  ");
	  ch=sc.nextInt();
switch(ch)
{
case 1:
System.out.println("sorting in ascending order");
	for(int i=0;i<arr.length;i++)
	{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]>arr[j])
		{
			t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
			
		}
	}
	}
for(int i:arr)
{
	System.out.print(i+" ");
}
System.out.println();
break;

case 2:
	System.out.println("sorting in descending order");
	for(int i=0;i<arr.length;i++)
	{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]<arr[j])
		{
			t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
			
		}
	}
	}
	for(int i:arr)
	{
		System.out.print(i+" ");
	}
	System.out.println();
	break;
default:
	System.out.println("enter the ecorrect  choice");
	break;
	
}
System.out.println("do you waant to continue press y and pop press any key");
d=sc.next().charAt(0);
}while(d=='y');

sc.close();
}

}
