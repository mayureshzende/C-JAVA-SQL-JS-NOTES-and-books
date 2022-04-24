import java.util.Scanner;
class ScannerDemo {
 public static void main(String[] args) {
 	Scanner sc = new Scanner(System.in);

 	System.out.println("Enter ID:");
 	int id = sc.nextInt();
 	System.out.println("Enter Name:");
 	String name = sc.next();
 	System.out.println("Enter Marks:");
 	float marks = sc.nextFloat();
   System.out.printf("[RollNo=%d Name=%s Marks=%.2f]\n",
   					  id,name,marks);

   	System.out.println
 ("Enter Student details as <RollNO> <Name> <Marks>");
   	//11 PGA 89.3
   	id = sc.nextInt();
   	name = sc.next();
   	marks = sc.nextFloat();
   	System.out.printf("[RollNo=%d Name=%s Marks=%.2f]\n",
   					  id,name,marks);

 }
}






