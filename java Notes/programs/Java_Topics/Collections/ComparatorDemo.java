package Collections;
import java.util.*;
public class ComparatorDemo {
public static void main(String[] args) {
	
	TreeSet t=new TreeSet(new MyComparator()); // if we take new TreeSet() method instead of passing the object, by default sorting is ascending
	t.add(15);
	t.add(10);
	t.add(2);
	t.add(5);
	t.add(20);
	t.add(0);
	System.out.println(t); //[10,15,10,5,2,0] //watch video Core Java With OCJP/SCJP: Collections Part-9 || comparator at (34.52 time)
}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer I1=(Integer)obj1;
		Integer I2=(Integer)obj2;
		
		 return -I1.compareTo(I2); //descending sorting oder 
		 // I2.compareTO(I1); descending and if we take -I2.compareTo(I1); default  ascending
		
		 // return +1; the same insertion order including the duplicates  
		 // return -1; returns the reverse insertion oder
		 //	return I1.compareTo(I2); we will get normal sorting order result i.e ascending order
		 // return 0; // only first then no elements will be inserted
		 
//		if(I1>I2)
//		{
//			return -1;
//		}
//		else if(I1<I2)
//		{
//			return +1;
//		}
//		else
//		{
//			return 0;
//		}
//		
	}

}
