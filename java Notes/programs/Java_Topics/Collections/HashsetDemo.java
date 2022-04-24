package Collections;
import  java.util.*;
public class HashsetDemo {
public static void main(String[] args) {
	
	HashSet h=new HashSet();
	h.add("Z"); 
	h.add("M");
	h.add("L");
	h.add("B");
	h.add("A");
	h.add(null);
	h.add("C");
	
	
	System.out.println(h.add("A"));
	System.out.println(h);
	
	
}
}
