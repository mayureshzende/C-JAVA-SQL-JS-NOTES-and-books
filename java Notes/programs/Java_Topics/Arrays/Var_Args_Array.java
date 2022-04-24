package Arrays;
import java.util.Arrays;
public class Var_Args_Array {
public static void main(String[] args) {
	
	System.out.println(add(2,3,4,5,5,6));
	
}

static int add(int a1,int... a)
{
	int sum=0;
	for(int i=0;i<a.length;i++)
	{	sum +=a[i];
	}
	return sum+a1;
}
}
