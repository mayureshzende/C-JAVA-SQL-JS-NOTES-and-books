class A1 {}
class B1 extends A1 {}
public class OverloadOverloadPuzzle {
	public static void main(String[] args) {
		main(8);//int->Integer->Object
		main(8,9);//fix int found
		main(8,9,10);//int,int,int->Integer,Integer,Integer->Object->Object->Object,var-arg
		main(args.length);//int
		main(args[0]);//String
		main(new B1());//B1
		main(new A1());//A1=>Object
		main();//var-arg(0 arguments are accepted in var-arg)
		//main(null);//Ambiguity error
	}
	public static void main(String s) {
		System.out.println("String");
	} 
	public static void main(Object s) {
		System.out.println("Object");
	} 
	public static void main(int ... s) {
		System.out.println("var-arg");
	} 
	public static void main(int a, int b) {
		System.out.println("int-int");
	} 

	public static void main(B1 s) {
		System.out.println("B1");
	} 
}
//java OverloadOverloadPuzzle Java 2




