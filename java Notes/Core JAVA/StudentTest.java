
class Student {
  private int rollNo;//instance variable
  private String name;//instance variable
  private float marks;//instance variable

  // Getter + Setter Methods
  public int getRollNo() {
  	return this.rollNo;
  }

  public void setRollNo(int rollNo) {
  	//rollNo-local varaible
  	//this.rollNo - instance variable
  	this.rollNo = rollNo;
  }

  public String getName() {
  	return this.name;
  }
  public void setName(String name) {
  	this.name = name;
  }

  public float getMarks() {
  	return this.marks;
  }
  public void setMarks(float marks) {
  	this.marks = marks;
  }

  public void showDetails() {
    System.out.printf("[RollNo=%d Name=%s Marks=%f]\n",
    				  this.rollNo,this.name,this.marks);
  }
}

class StudentTest {
  public static void main(String[] args) {
  	Student s1 = new Student();

  	//s1.rollNo = 8;//ERROR-private 
  	s1.setRollNo(8);
  	s1.setName("John");
  	s1.setMarks(81);

  	Student s2 = new Student();
  	s2.setRollNo(17);
  	s2.setName("Fred");
  	s2.setMarks(71);

  	s1.showDetails();
  	s2.showDetails();
  }
}



