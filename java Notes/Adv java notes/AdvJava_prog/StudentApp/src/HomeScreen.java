import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;

public class HomeScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen window = new HomeScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public HomeScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnAddStudent = new JButton("Add Student");
		btnAddStudent.setBounds(165, 38, 133, 29);
		frame.getContentPane().add(btnAddStudent);
		btnAddStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddScreen obj = new AddScreen();	
			}
		});
		
		JButton btnDeleteStudent = new JButton("Delete Student");
		btnDeleteStudent.setBounds(165, 95, 133, 29);
		frame.getContentPane().add(btnDeleteStudent);
		btnDeleteStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteScreen obj = new DeleteScreen();
			}
		});
		JButton btnUpdateStudent = new JButton("Update Student");
		btnUpdateStudent.setBounds(165, 153, 133, 29);
		frame.getContentPane().add(btnUpdateStudent);
		
		JButton showAllButton = new JButton("Show All");
		showAllButton.setBounds(165, 207, 133, 29);
		frame.getContentPane().add(showAllButton);
		showAllButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new StudentList();
			}
		});
	}
}
