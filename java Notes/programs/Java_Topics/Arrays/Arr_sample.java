package Arrays;
import java.util.Arrays;


public class Arr_sample 
{
	public static void main(String[] args) {
		
		
		int[] myArr= {1,2,3,5,7};
//		for(int a:myArr)
//		{
//			System.out.println(a);
//		}
		
	int[] secondTest=Arrays.copyOf(myArr, myArr.length);
			secondTest[1]=10;
			
			System.out.println("----------");
			for(int s:secondTest)
			{
				System.out.println(s);
			}
			System.out.println("----------");
			int sum=0;
			for(int a:myArr)
			{
				sum +=a;
				System.out.println(sum );
			}
			
	}
}
