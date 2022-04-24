import java.util.List;
public class TestStudent {
	public static void main(String[] args) {
		try {
			StudentDao.addStudent(5, "Test", 71);
			StudentDao.deleteStudent(4);
			StudentDao.updateStudentMarks(2, 66);
			List<Student> list = StudentDao.getAllStudents();
			System.out.println(list);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
