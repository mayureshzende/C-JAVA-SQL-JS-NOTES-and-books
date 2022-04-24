//package com.interview 
import java.util.*;
class Interview {
		
	public static void main(String args[]){
		
		HashMap<Integer,String> t =new HashMap<Integer,String>();//new MyComparator());

		// t.add("aaa");
		// t.add("c");
		// t.add("ll");
		// t.add("zzzzzzzz");


		t.put(1,"sher");
		t.put(34,"set");
		t.put(3,"happy");
		t.put(15,"bell");
		t.put(4,"tail");
		t.put(2,"test");
		t.put(12,"sdas");
		t.put(5,"asd");


		// t.removeAll(t);
		
		// System.out.println(t.tailSet(3));
		System.out.println(t);

		Set s1 = t.keySet();
		System.out.println(s1);

		Collection c = t.values();
		System.out.println(c);

		for(Map.Entry i: t.entrySet()){
			if(i.getKey().equals(1)){
			System.out.println(i.getKey() + "-- " + i.getValue());
			}

		}

		System.out.println(" is " + t.get(12));
		System.out.println(t.size());

		HashMap<Integer,String> t1 =new HashMap<Integer,String>();
		t1 = (HashMap)t.clone();
		System.out.println("new HashMap is "+ t1);

		}
	}

	class MyComparator implements Comparator {
		public int compare(Object obj1, Object obj2){

			// String s1 = obj1.toString();
			// String s2 = (String)obj2 ;

			Integer I1 = (Integer)obj1;
			Integer I2 = (Integer)obj2;


			// if(I1 < I2){
			// 	return +1;
			// }else if(I1 > I2) {
			// 	return -1 ;
			// }
			if(I1 <8 ){
				return +1;
			}
			else{
			return  0;//I1.compareTo(I2);
		}
		}
	}
	/* 


		LinkedList<String> al = new LinkedList<String>();
		
		al.add("red ");
		al.add("orange");
		al.add("blue");
		al.add("black");
		al.add(1,"mango");
		al.add("yellow");
		al.offerLast("top");
		al.add("opel");


		ListIterator itr = al.listIterator(al.size());
		int cnt = 0; 
		while(itr.hasPrevious()){
			cnt++; 
			System.out.println(itr.previous());
		}
		
		System.out.println(al + " -------------------- count is " + cnt );

		for(String e : al){
			System.out.println(e);	
		}

		System.out.println("first ele" + al.getFirst());
		System.out.println("last is " + al.getLast());
		System.out.println( al.contains("mango") +"mango  is present ") ;

		ArrayList ar = new ArrayList(al);
		ar.clear();
		System.out.println(ar);

		Object[] o = al.toArray();

		for(Object e : o){
			System.out.println(e);
		}
		
	// Collections.shuffle(al);
		
		// System.out.println(al);


		ArrayList a2 = new ArrayList();
		// for(int i = 2 ; i < 5 ; i++){
		// 	a2.add(al.get(i));
		// } 

		a2.add("red ");
		a2.add("orange");
		a2.add("blue");
		a2.add("yellow");
		a2.add("black");
		a2.add("opel");
		System.out.println(a2);

		System.out.println(a2.containsAll(al));

	*/