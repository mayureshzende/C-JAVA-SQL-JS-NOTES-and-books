package basic_programs;
import java.util.*;
public class Formula {
	 public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        
	        for(int i=0;i<t;i++)
	        {
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	              for(int m=0;m<n;m++)
	            {
	            	a +=b;
	            	if(m>0)
	            			System.out.print(" ");
        			System.out.print(a);
	           
	            	b =b*2;
	            }
	            
	            System.out.println();
	        }
	        in.close();
	    }
}
/*
1
0 2 10
5 3 5

Your Output (stdout)
4 6 0 2 12 14 8 10 20 22 
11 14 5 8 23 

Expected Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98


        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            int n=in.nextInt();
            for(int j=0;j<n;j++){
                a+=b;
                if(j>0)
                System.out.print(" ");
                System.out.print(a);

                b=b*2;
            }
            System.out.println("");
        }
        in.close();
 
*/