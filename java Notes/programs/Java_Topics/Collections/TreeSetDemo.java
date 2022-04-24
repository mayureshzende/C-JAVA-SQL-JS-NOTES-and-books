package Collections;
import java.util.*;
public class TreeSetDemo {
public static void main(String[] args) {
	
	TreeSet t=new TreeSet();
	t.add("A");
	t.add("a");
	t.add("B");
	t.add("c");
	t.add("c");
	//t.add(new Integer(10)); //cast to integer i.e no hetrogenous obejcts are allowed
	//t.add(null); //nul pointer exception
	System.out.println(t); //sorted according to natural sorting order alphabetically
	
	
/**	t.add(new StringBuilder("A")) //we will get cast class cast exception because it does not implements the Comparable Interface 
but the String class Implements the comparable interface so it is allowed,
and  from JDK v1.7 we cannot add the null as a first elements also because iit is caparing the elementss to maintain the sorting order

and objects should always be homogeneous and comparable

	TreeSet t=new TreeSet();
	t.add(3);
	t.add(1);
	t.add(2);
	t.add(4);
	t.add(10);
	System.out.println(t);
	
	*/
}
}
