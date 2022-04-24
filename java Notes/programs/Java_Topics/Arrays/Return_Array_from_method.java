package Arrays;

public class Return_Array_from_method {
static int[] get()
{
	//int a[]={1,2,4};
	return new int[] {7,8,9};
}

public static void main(String[] args) {
	int arr[]=get();
	for(int a:arr)
	System.out.println(a);
}
}
