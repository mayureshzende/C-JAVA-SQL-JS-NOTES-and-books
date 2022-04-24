import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DeleteScreen {

	private JFrame frame;
	private JTextField rollNo;

	/**
	 * Create the application.
	 */
	public DeleteScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterRollNumber = new JLabel("Enter Roll Number you want to Delete");
		lblEnterRollNumber.setBounds(80, 28, 305, 33);
		frame.getContentPane().add(lblEnterRollNumber);
		
		rollNo = new JTextField();
		rollNo.setBounds(80, 66, 238, 33);
		frame.getContentPane().add(rollNo);
		rollNo.setColumns(10);
		
		JButton btnDeleteStudent = new JButton("Delete Student");
		btnDeleteStudent.setBounds(132, 129, 117, 29);
		frame.getContentPane().add(btnDeleteStudent);
		btnDeleteStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int r = Integer.parseInt(rollNo.getText());
				try {
				StudentDao.deleteStudent(r);
				JOptionPane.showMessageDialog(frame, "Deleted successfully...");
				}catch(Exception e1) {
					
				}
			}
		});
	}

}
