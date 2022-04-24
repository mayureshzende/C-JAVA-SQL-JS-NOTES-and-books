import java.util.List;
import java.util.Scanner;
public class TestStudent {
public static void main(String[] args) {
	try 
	{
		//StudentDao.AddStudent(7,"jas",63);
		int r,ch;
		String n;
		float m;
		//String a=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("\t ****MENU**** \n");
		System.out.println("\t 1.insert \n 2.delete \n 3.update \n 4.show \n");
		
		while(true)
		{
		   System.out.println("\t ****MENU**** \n");
		   System.out.println("\t 1.insert \n\t 2.delete \n\t 3.update \n\t 4.show \n\t 5.exit \n");
			
		   System.out.println("enter your choice:");
		   ch=sc.nextInt();
		   
		switch(ch) {
			case 1:
			System.out.println("enter the deatials");
			System.out.println("enter the id=");
			r=sc.nextInt();
			System.out.println("enter the name=");
			n=sc.next();
			System.out.println("enter the id=");
			m=sc.nextFloat();
			StudentDao.AddStudent(r,n,m);
			System.out.println("inserted");
			break;
			
			case 2:
				System.out.println("delete");
				System.out.println("enter the id=");
				r=sc.nextInt();
				StudentDao.DeleteStudent(r);
				System.out.println("Deleted");
				break;
				
			case 3:
				System.out.println("udate");
				System.out.println("enter the id ");
				r=sc.nextInt();
				System.out.println("enter the Marks");
				m=sc.nextInt();
				StudentDao.UpdateStudent(r,m);
			    System.out.println("updated");
			    break;
			case 4:
				System.out.println("details");
				List<Student> list=StudentDao.getAllStudent();
				System.out.println(list);
			
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("enter the correct choice");
			}	
		}
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
} 

}
