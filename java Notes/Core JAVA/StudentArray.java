import java.util.*;
class StudentArray {
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
  	System.out.println("Enter number of students:");
  	int n = sc.nextInt();
  	Student[] s = new Student[n];
  	for(int i=0; i<n;i++) {
  	 System.out.printf("Enter info of student %d in format <id> <name> <%%>",(i+1));
  	 //1 Fred 87
  	 int r = sc.nextInt();
  	 String name = sc.next();
  	 float m = sc.nextFloat();
  	 s[i] = new Student(r,name,m);
  	}
  	System.out.println(Arrays.toString(s));
  	System.out.println("topper is: " + findTopper(s));
  }
  static Student findTopper(Student[] arr) {
  	Student topper = arr[0];
  	for(int i=1; i<arr.length;i++) {
  		if(arr[i].marks > topper.marks) {
  			topper = arr[i];
  		}
  	}
  	return topper;
  }
}

class Student {
 private int id;
 private String name;
 float marks;
 Student() {}
 Student(int id,String name, float marks) {
 	this.id=id; this.name=name; this.marks=marks;
 }
  
 public String toString() {
  return "[ID="+this.id+",Name="+this.name+",%="+this.marks+"]\n";
 }
}






