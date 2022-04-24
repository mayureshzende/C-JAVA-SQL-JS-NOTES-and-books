import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class AddScreen extends JFrame {

	private JPanel contentPane;
	private JTextField Roll_No;
	private JTextField Name;
	private JTextField Marks;
	private JFrame Frame;
	private JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddScreen frame = new AddScreen();
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
	public AddScreen() {
		Frame=new JFrame();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 716, 445);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
	
		JLabel lblAdd = new JLabel("Roll NO");
		lblAdd.setForeground(Color.ORANGE);
		lblAdd.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblAdd.setBounds(77, 50, 114, 37);
		contentPane.add(lblAdd);
		
	//	Frame.getContentPane().add(lblAdd);
		
		
		JLabel lblUpdate = new JLabel("Name");
		lblUpdate.setForeground(Color.ORANGE);
		lblUpdate.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblUpdate.setBounds(77, 169, 114, 37);
		contentPane.add(lblUpdate);
		
		JLabel lblMarks = new JLabel("Marks");
		lblMarks.setForeground(Color.ORANGE);
		lblMarks.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblMarks.setBounds(77, 272, 114, 42);
		
		
		
		Roll_No = new JTextField();
		Roll_No.setBounds(182, 50, 226, 42);
		contentPane.add(Roll_No);
		//Frame.getContentPane().add(Roll_No);
		Roll_No.setColumns(10);
				
		
		Name = new JTextField();
		Name.setBounds(182, 165, 226, 40);
		contentPane.add(Name);
		//Frame.getContentPane().add(Name);
		Name.setColumns(10);
		
		Marks = new JTextField();
		Marks.setBounds(182, 278, 226, 37);
		contentPane.add(Marks);
		//Frame.getContentPane().add(Marks);
		Marks.setColumns(10);
		
		
		
		contentPane.add(lblMarks);
		
		btnNewButton = new JButton("ADD ");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(483, 140, 141, 96);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int r=Integer.parseInt(Roll_No.getText());
				String n=Name.getText();
				float m=Float.parseFloat(Marks.getText());
				try {
					StudentDao.AddStudent(r, n, m);
					String s="inserted";
				//	JOptionPane.showInternalMessageDialog(Frame,s);
				}catch(Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
	}
}
