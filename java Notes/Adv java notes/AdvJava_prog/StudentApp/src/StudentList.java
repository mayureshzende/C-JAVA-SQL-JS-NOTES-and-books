import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTable;

public class StudentList {
	private JFrame frame;
	public StudentList() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);

		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String[] columns = {"Roll Number","Name","Marks"};
		List<Student> list  = null;
		try {
			list = StudentDao.getAllStudents();
		}catch(Exception e) {}
		
		String[][] data = new String[list.size()][3];
		
		for(int i=0 ; i < list.size(); i++) {
		  Student s = list.get(i);
		  data[i][0] = "" + s.getId();  //Roll no
		  data[i][1] = s.getName();//Name
		  data[i][2] = "" + s.getMarks();//Marks			
		}
		
		JTable table = new JTable(data,columns);
		frame.getContentPane().add(table);
	}
}








