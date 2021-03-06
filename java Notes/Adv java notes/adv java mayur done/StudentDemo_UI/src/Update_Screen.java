import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Update_Screen extends JFrame {

	private JPanel contentPane;
	private JTextField Roll_No;
	private JTextField Marks;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update_Screen frame = new Update_Screen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Update_Screen() {
		
	//	Frame=new JFrame();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 725, 458);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRollNo = new JLabel("Roll no");
		lblRollNo.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblRollNo.setBackground(Color.GRAY);
		lblRollNo.setToolTipText("");
		lblRollNo.setForeground(new Color(0, 0, 0));
		lblRollNo.setBounds(181, 20, 107, 94);
		contentPane.add(lblRollNo);
		
		JLabel lblNewMarks = new JLabel("New Marks ");
		lblNewMarks.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewMarks.setBackground(Color.GRAY);
		lblNewMarks.setToolTipText("");
		lblNewMarks.setForeground(new Color(0, 0, 0));
		lblNewMarks.setBounds(181, 124, 173, 79);
		contentPane.add(lblNewMarks);
		
		Roll_No = new JTextField();
		Roll_No.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		Roll_No.setBounds(293, 46, 206, 46);
		contentPane.add(Roll_No);
		Roll_No.setColumns(10);
		
		Marks = new JTextField();
		Marks.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		Marks.setBounds(293, 142, 206, 46);
		contentPane.add(Marks);
		Marks.setColumns(10);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBackground(Color.ORANGE);
		btnUpdate.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnUpdate.setBounds(241, 269, 162, 54);
		contentPane.add(btnUpdate);
		btnUpdate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int r=Integer.parseInt(Roll_No.getText());
				float m=Float.parseFloat(Marks.getText());
			
			try {
				StudentDao.UpdateStudent(r,m);
			}catch(Exception e2)
			{
				e2.printStackTrace();
			}
			}
		});
	}

}
