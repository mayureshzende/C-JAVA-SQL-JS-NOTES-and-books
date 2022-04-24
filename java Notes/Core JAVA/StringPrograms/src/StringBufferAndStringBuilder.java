
//StringBuffer  - Synchronized
//StringBuilder - Not Synchronized
public class StringBufferAndStringBuilder {
	public static void main(String[] args) {
		StringBuilder buf = new StringBuilder("java");
		buf.append("PGA");//javaPGA
		buf.deleteCharAt(3);//javPGA
		buf.replace(1, 3, "ABC");//jABCPGA
		buf.setCharAt(4, '*');//jABC*GA
		
		buf.insert(5, "test");//jABC*testGA
		buf.insert(1, '$');//j$ABC*testGA
		buf.reverse();//AGtset*CBA$j
		System.out.println("After reversing " + buf);
		buf.delete(3, 6);//AGt*CBA$j
		buf.replace(1, 3, "String");//AString*CBA$j
		buf.setLength(5);//AStri
		System.out.println(buf);
	}
}
// Next topic : Inheritance





