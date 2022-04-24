package Ploymorphism;



public class mth_overloading {
	
	static double add(float a,int b) {
		System.out.println("diff meth");return a+b;}
static int add(int a,int b) {return a+b;}
static int add(int a,int b,int c) {return a+b+c;}


public static void main(String[] args) {
	//System.out.println(mth_overloading.add(1.0f,2));
	System.out.println(mth_overloading.add(1,2));

	System.out.println(mth_overloading.add(1, 2, 3));
}

}
