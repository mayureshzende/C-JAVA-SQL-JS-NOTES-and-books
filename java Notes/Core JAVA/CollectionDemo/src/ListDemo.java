import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Pune");
		list.add("Nasik");
		list.add("Jalgaon");
		list.add("Mumbai");
		list.add("Goa");
		System.out.println(list);
		
		//Get
		System.out.println(list.get(2));//Jalgaon
		list.remove(1);//Nasik
		
		System.out.println("Pune:" + list.contains("Pune"));
		//Pune->Jalgaon->Mumbai->Goa
		list.add(3, "Chennai");//insert
		System.out.println(list);
		list.set(1, "Hyderabad");//replace/modify
		System.out.println(list);
		List<String> sList = new ArrayList<>(list);
		Collections.sort(sList);
		System.out.println("Sorted:" + sList);
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}








