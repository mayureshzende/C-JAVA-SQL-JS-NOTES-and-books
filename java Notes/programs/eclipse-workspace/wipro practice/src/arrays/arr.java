package arrays;

public class arr {

	 
	 public static void main(String[] args) {
		if(args.length<2) {
			System.out.println("enter 2 args");
			
		}
		
		int a1=Integer.parseInt(args[0]);
		int b1=Integer.parseInt(args[1]);
		addi a=new addi(a1,b1);
		int res=a.add(a1,b1);
		System.out.println("*** \n"+res);
		
	}
	 
}
class addi
{

	private int a;
	private int b;
	addi(){}

	addi(int a,int b) {
		this.a = a;
		this.b = b;
	}
	 public int add(int a,int b) {
		 return a+b;
	 }
}
