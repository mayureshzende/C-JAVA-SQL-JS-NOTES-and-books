package Collections;
import java.util.*;

public class HashTableDemo {
public static void main(String[] args) {
	
	Hashtable h=new Hashtable();
	h.put(new TempHD(5),"A");
	h.put(new TempHD(10),"B");
	h.put(new TempHD(20),"H");
	h.put(new TempHD(17),"C");
	h.put(new TempHD(23),"E");
	h.put(new TempHD(16),"Z");
	System.out.println(h);
	/** // the above element are store in bucket is the (argumentpassed % size(11) ) default size is (11) in that bucket location 20%11=9 so it will
    go at 9th location the printing order is the top to bottom and from if the bucket at specific location has more element then it is right to left. 
	i.e at 9th location it ha [5=a,16=z] the sout will print {16=z,5=A}	
	
	if we change the hashCode() of TempHD class as return i%9 then the output is different. is change in formula change in output
	
	if we change the initial capacity of the Hashtable(25) then  the o/p is changed then i%25 
	*/
}
}

class TempHD
{
	int i;
	TempHD(int i)
	{
		this.i=i;	
	}
	public int hashCode()
	{
		return i;
	}
	
public String toString()
{
	return i+" ";
}

}
