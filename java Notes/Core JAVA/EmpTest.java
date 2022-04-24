//java EmpTest 12 Fred 75000
class EmpTest {
 public static void main(String[] args) {
   if(args.length < 3) { 
   	System.out.println("Please pass 3 arguments");
   	System.exit(0);
   }
   int id = Integer.parseInt(args[0]);
   String name = args[1];
   float sal = Float.parseFloat(args[2]);
   Emp e = new Emp(id,name,sal);
   System.out.println(e);//object to String
 }
}
class Emp {
 private int empId;
 private String name;
 private float salary;
 Emp() {}
 Emp(int empId, String name, float salary) {
  this.empId = empId;
  this.name = name;
  this.salary = salary;
 }
 public String toString() {
   return "[Id="+empId+",Name="+name+",Salary="+salary+"]";
 }
}