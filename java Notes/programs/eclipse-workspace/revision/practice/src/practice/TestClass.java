package practice;


import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception
    {
       
        //Scanner s = new Scanner(System.in);
        
        //int num;
        
        int kases=3;
        
       
            int N=15;
         //   scanf("%d", &N);

            for(int i = 1; i <= N; ++i) 
            {
            
                if(i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz\n");
                else if(i % 3 == 0) System.out.println("Fizz\n");
                else if(i % 5 == 0) System.out.println("Buzz\n");
                else System.out.println(i);
            }
      
      
     
}
}
