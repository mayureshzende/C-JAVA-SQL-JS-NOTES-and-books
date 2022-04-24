import java.util.*;
import java.io.*;

class Sam
{
	public static void main(String[] args)throws Exception
	{
		ArrayList al =new ArrayList();

		al.add("c");
		al.add("m");
		al.add("b");
		al.add("a");
		System.out.println(al);

		// Collections.reverse(al);
		// System.out.println(al);

		Collections.sort(al,new MyComparator());
		System.out.println(al);

		System.out.println(Collections.binarySearch(al,"m",new MyComparator()));
		System.out.println(Collections.binarySearch(al,"d",new MyComparator()));

		

		// Collections.reverseOrder(al);
		// System.out.println(al);

	}	
}

class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2){
		String s1=(String)obj1;
		String s2=obj2.toString();

		return s2.compareTo(s1);
	}
}

// System.out.println(l.add(2));
/*
	Vector l=new Vector();
		System.out.println(" capacity is" + l.capacity());
		
		for(int j =1 ; j <=10 ; j++)
			l.add(new Integer(j));
		l.addElement(1);
		l.add(10);
		l.add(20);	
		l.add(30);

		System.out.println("capacity is "+ l.capacity());
		// l.remove(2);
		// l.set(1,3);
		System.out.println("index is "+ l.indexOf(20));
		System.out.println(l.size());

		for(int i=0; i < l.size() ; i++ )
		System.out.println(l.get(i)); 

			Enumeration e=v.elements();
	while(e.hasMoreElements()){
		Integer I = (Integer)e.nextElement();
		if( I % 2 == 0 ){
		System.out.println(I);


			Vector v= new Vector();
	for(int i=1 ; i<=10 ; i++)
	v.add(i);
	
	Iterator itr = v.iterator();

	while(itr.hasNext()){
		Integer I = (Integer) itr.next();
		if(I % 2 == 0 )
		{
			System.out.println(I);
		}else{
			I.remove()
		}
	}

System.out.println(v);
ArrayList al = new ArrayList();
		al.add("aa");
		al.add("mayur");
		al.add("ll");
		al.add("zz");

		ListIterator litr = al.listIterator();

		while(litr.hasNext()){
			
			String s=(String)litr.next();
			if(s.equals("aa"))
			{
				litr.set("allu");
			}else if(s.equals("ll")){
				litr.add("love");
			}else if(s.equals("zz")){
				litr.remove();
			}else{}
		}
		System.out.println(al);


	}
	}



	-------------------------------- comparable object -----------
	class Employee implements Comparable
{
	int id;
	String name;

	Employee(int id, String name){
		this.id  = id ;
		this.name = name ;
	}

	public String toString(){
		return id + "---" + name;
	}

	public int compareTo(Object obj){
		int e1=this.id;

		Employee e=(Employee)obj;
		int e2=e.id;
		if(e1 < e2)
		{
			return -1;
		}else if(e1 > e2){
			return +1;
		}else {
			return 0;
		}

	}
}

	Employee e1=new Employee(1,"mayur");
		Employee e2=new Employee(3,"asd");
		Employee e3=new Employee(2,"fdfsd");
		Employee e4=new Employee(0,"zzzzzzz");
		Employee e5 = new Employee(5,"lllll");
		TreeSet h=new TreeSet();//new MyComparator());
		h.add(e1);
		h.add(e2);
		h.add(e3);
		h.add(e4);
		h.add(e5);
		// h.add("a");
		// h.add("cc");
		// h.add("d");
		// h.add("zzz");
		// h.add("bb");
		// h.add("aa");
		// System.out.println("Z".compareTo("a"));
		System.out.println(h);

		TreeSet h1=new TreeSet(new MyComparator());
		h1.add(e1);
		h1.add(e2);
		h1.add(e3);
		h1.add(e4);
		h1.add(e5);
		System.out.println(h1);


		class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2){
		// String s1=obj1.toString();
		// String s2=obj2.toString();
		// Integer I1 = s1.length();
		// Integer I2 = s2.length();
		Employee e1 =(Employee)obj1;
		Employee e2 =(Employee)obj2;
		String s1 = e1.name ;
		String s2 = e2.name ;

		return s1.compareTo(s2);
		// return 0;
		// return -s1.compareTo(s2);
		// if(I1 < I2 ){
		// 	return +1;
		// }else if(I1 > I2 ){	
		// 	return -1;
		// }else{
		// 	return -s1.compareTo(s2);
		// }
	}
}
-------------------------------- Hashmap with map.entry -------------------
HashMap h=new LinkedHashMap();

		h.put(1,"mayur");
		h.put(4,"skipping");
		h.put(2,"lmn");
		h.put(10,"running");
		h.put(3,"Boss");
		h.put("m","mango");
		h.put("M","cap");
		System.out.println(h);

		System.out.println("set of keys are");
		Set s=h.keySet();
		System.out.println(s);

		System.out.println("coolection of values are");
		Collection c=h.values();
		System.out.println(c);

		System.out.println("key value pair are ");
		Set kv=h.entrySet();
		System.out.println(kv);

		Iterator itr=kv.iterator();

		while(itr.hasNext()){

			Map.Entry m=(Map.Entry)itr.next();

			System.out.println(m.getKey() + " - "  + m.getValue());
			if( m.getValue().equals("lmn")){
				itr.remove();
			}
		}
		System.out.println(h);


--------------------------- hashtable ----------- 
Hashtable ht=new Hashtable(); 

		ht.put(new Temp(10),"mayur");
		ht.put(new Temp(1),"lmn");
		// t.put(1,"mm");
		ht.put(new Temp(2),"adas");
		ht.put(new Temp(4),"asdas");
		ht.put(new Temp(3),"aasdasdas");
		ht.put(new Temp(18),"sdas");
		ht.put(new Temp(13),"aas");
		ht.put(new Temp(15),"as");
		System.out.println(ht);	
	}
}

class Temp 
{
	int i=0;
	Temp(int i)
	{
		this.i = i ;
	}
	public int hashCode(){
		return i;
	}

	public String toString(){
		return ""+i;
	}
}
------------ properties --------------
	Properties p=new Properties();
		FileInputStream fis = new FileInputStream("abc.Properties");

		p.load(fis);
		System.out.println(p);

		String s=p.getProperty("lmn");
		System.out.println(s);

		p.setProperty("ka","llll");

		FileOutputStream fos = new FileOutputStream("abc.properties");
		p.store(fos,"lmn to lllll");

		System.out.println(p);


*/