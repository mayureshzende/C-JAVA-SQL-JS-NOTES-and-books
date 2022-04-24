package Collections;
import java.io.Serializable;
import java.util.*; 
public class ArrayListDemo {
public static void main(String[] args) {
	
	
	ArrayList al=new ArrayList();
	al.add(10);
	al.add("mayur");
	al.add(null);
	System.out.println(al);
	al.remove(2);
	al.add(30);
	System.out.println(al);
	al.set(2,20);
	System.out.println(al);
	System.out.println("=========================");
	
	
	LinkedList l=new LinkedList();
	l.add("mayur");
	l.add(7);
	System.out.println(l);
	l.addFirst(0);
	l.addLast(null);
	System.out.println(l);
	l.set(2,2);
	System.out.println(l);
	l.remove(2);
	l.removeLast();
	System.out.println(l);
	
	System.out.println("=========================");
	System.out.println(al instanceof Serializable);
	System.out.println(al instanceof Cloneable);
	System.out.println(al instanceof RandomAccess);
	System.out.println("=========================");
	System.out.println(l instanceof Serializable);
	System.out.println(l instanceof Cloneable);
	System.out.println(l instanceof RandomAccess);
	
}
}
