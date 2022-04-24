package loops;
import java.util.*;
public class While_do_for {
	Scanner sc=new Scanner(System.in);


public static void main(String[] args) {
//
//		int i=0;
//	
//	while(i<10)
//	{
//		
//		System.out.println(i);
//		i++;
//		
//	}
//	int b=5;
//	do {
//		System.out.println(b);
//		b++;
//	}while(b<10);
//	
	
	
	Scanner sc=new Scanner(System.in);
	int a;
int b;
	
	do {
		
	
	System.out.println("enter the choice");
	System.out.println("***menu **** \n 1)add \n 2)sub \n " );
	a=sc.nextInt();
	
	switch(a)
	{
	case 1:
	System.out.println("\n addd");
	break;
	case 2:
	System.out.println("sub");
	break;

	}
	System.out.println("do yant to continue y=1/n=0");
	b=sc.nextInt();
	}while(b==1);
System.out.println("***exit***");



	


}
}
