package Arrays;


import java.util.Arrays;
public class RevOrgArr {
public static void main(String[] args) {
	
	int[] a= {1,2,3,4,5};
	Trav(a);
	System.out.println("reverrse is "+Arrays.toString(a));
}
public static void Trav(int[] a)
{
	for(int i=0,j=a.length-1;i<j;i++,j--)
	{
		int t=a[i];
		a[i]=a[j];
		a[j]=t;
	}
}

}
