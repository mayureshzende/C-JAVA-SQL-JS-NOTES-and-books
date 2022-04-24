import java.util.List;
public class TestStudent {
public static void main(String[] args) {
	try 
	{
		//StudentDao.AddStudent(7,"jas",63);
		StudentDao.UpdateStudent(3,87);
		StudentDao.DeleteStudent(9);
		List<Student> list=StudentDao.getAllStudent();
		System.out.println(list);
	}catch(Exception e)
	{
		e.printStackTrace();
	}
} 

}
