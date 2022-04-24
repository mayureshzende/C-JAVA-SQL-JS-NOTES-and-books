import java.util.*;
class Student {
	int id; String name; float marks;
	Student(int id, String name, float marks) {
		this.id = id; this.name = name; this.marks = marks;
	}
	public String toString() {
		return "[id="+id+",name="+name+",marks="+marks+"]\n";
	}
}
class IDComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		return s1.id == s2.id ? 0 : s1.id < s2.id ? -1 : 1;
	}
}
class NameComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}
}
class MarksComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		return s1.marks == s2.marks ? 0 : s1.marks < s2.marks ? -1 : 1;
	}
} 
public class ListSorting {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(15,"Fred",88));
		list.add(new Student(11,"Geoff",71));
		list.add(new Student(16,"Jason",85));
		list.add(new Student(1,"John",65));
		list.add(new Student(5,"Rob",90));
		List<Student> list2 = new ArrayList<Student>(list);
		List<Student> list3 = new ArrayList<Student>(list);

		Collections.sort(list, new IDComparator());
		Collections.sort(list2, new NameComparator());
		Collections.sort(list3, new MarksComparator());
		System.out.println(list);//Id
		System.out.println(list2);//name
		System.out.println(list3);//marks

	}
}


