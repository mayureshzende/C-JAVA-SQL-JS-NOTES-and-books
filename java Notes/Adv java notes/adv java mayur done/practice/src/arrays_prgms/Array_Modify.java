package arrays_prgms;

public class Array_Modify {
public static void main(String[] args) {
  int[] arr= {1,2,3,4};
	fun(arr);
	for(int e:arr) {
		System.out.println(e);
	}
}

public static void fun(int[] a)
{
	for(int i=0;i<a.length;i++) 
	{
		a[i]=a[i]*a[i];
	}
}


}
