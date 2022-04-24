package Collections;
import java.util.*;
public class ComparableDemo {
public static void main(String[] args) {
	
	System.out.println("A".compareTo("Z"));//-25 if obj1 comes before obj2
	System.out.println("Z".compareTo("K"));// 15 if obj2 comes before obj1
	System.out.println("A".compareTo("A"));//0 if both are equal
	
	

	//if we compare null to obj we get runtime exception 
	//the element which is to to inserted is obj1 and which is already inserted is obj2
	//in treeset it internally calls compareTo() method
	
}
}

