//Program using Constructor and toString() method
class Student {
  private int rollNo;
  private String name;
  private float marks;
  Student() {}

  Student(int id, String name, float m) {
    this.rollNo = id;
    this.name = name;
    this.marks = m;
  }

  public String toString() {
    return String.format("[RollNo=%d,Name=%s,Marks=%f]",
                   this.rollNo,this.name,this.marks);
    /*return "[RollNo=" + this.rollNo +",Name=" + 
            this.name + ",Marks=" + this.marks+"]";*/
  }
}

class StudentTest2 {
  public static void main(String[] args) {
  	Student s1 = new Student(8,"John",80.5f);
  	Student s2 = new Student(7,"Fred",77.5f);
    Student s3 = new Student();

  	System.out.println(s1);//toString() will be called
    System.out.println(s2);
    System.out.println(s3);
  }
}






