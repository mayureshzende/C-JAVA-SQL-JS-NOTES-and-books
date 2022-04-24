import java.awt.event.*;
import javax.swing.*;

public class AddScreen {
	private JFrame frame;
	private JTextField rollNo;
	private JTextField name;
	private JTextField marks;

	public AddScreen() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 350, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Roll number
		JLabel lblRollNumber = new JLabel("Roll Number");
		lblRollNumber.setBounds(60, 40, 92, 25);
		frame.getContentPane().add(lblRollNumber);
		
		rollNo = new JTextField();
		rollNo.setBounds(175, 34, 130, 37);
		frame.getContentPane().add(rollNo);
		rollNo.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(60, 98, 92, 25);
		frame.getContentPane().add(lblName);
		
		name = new JTextField();
		name.setBounds(175, 92, 130, 37);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		JLabel lblMarks = new JLabel("Marks");
		lblMarks.setBounds(60, 164, 92, 25);
		frame.getContentPane().add(lblMarks);
		
		marks = new JTextField();
		marks.setBounds(175, 158, 130, 37);
		frame.getContentPane().add(marks);
		marks.setColumns(10);
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.setBounds(128, 212, 121, 37);
		frame.getContentPane().add(btnAddStudent);
		
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int r = Integer.parseInt(rollNo.getText());
				String n = name.getText();
				float m = Float.parseFloat(marks.getText());
				try {
					StudentDao.addStudent(r, n, m);
					JOptionPane.showMessageDialog(frame, "Record Added");
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
	}
}




