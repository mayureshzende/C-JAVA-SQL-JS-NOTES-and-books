package Collections;
import java.util.*;
public class CollectionsSearchDemo {
public static void main(String[] args) {
	
	
	ArrayList l=new ArrayList();
	l.add("Z");
	l.add("K");
	l.add("A");
	l.add("M");
	l.add("a");
	System.out.println(l);
	
	
	Collections.sort(l); //compalsary before binary search the list must be sorted
	System.out.println(Collections.binarySearch(l,"Z")); //if we do not sort and then search using binary search then we wont get any CE or Re but Unexpected output we will get
	System.out.println(Collections.binarySearch(l,"J")); // it returns the index if found the element but idf not found  it  returns the insertion point i.e [-1 -2- -3- 4 -5 -6]

	
	System.out.println("+++++++++ -------- fro custamized sorting_ ---------++++++++++++");
	ArrayList cl=new ArrayList();
	cl.add(10);
	cl.add(20);
	cl.add(15);
	cl.add(5);
	cl.add(0);
	System.out.println(cl);
	Collections.sort(cl,new MyComparatorCS());
	System.out.println(cl);
	System.out.println(Collections.binarySearch(cl,10,new MyComparatorCS()));
	System.out.println(Collections.binarySearch(cl,7,new MyComparatorCS()));
	System.out.println(Collections.binarySearch(cl,7));
}	
}


class MyComparatorCS implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer I1=(Integer)obj1;
		Integer I2=(Integer)obj2;
		return I2.compareTo(I1);
	}
}