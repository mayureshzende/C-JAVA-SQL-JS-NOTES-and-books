package Studentui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteSt extends JFrame {

	private JPanel contentPane;
	private JTextField ROLL_NO;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteSt frame = new DeleteSt();
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
	public DeleteSt() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 710, 448);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ROll NO");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 21));
		lblNewLabel.setBounds(296, 50, 107, 67);
		contentPane.add(lblNewLabel);
		
		ROLL_NO = new JTextField();
		ROLL_NO.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		ROLL_NO.setBackground(Color.WHITE);
		ROLL_NO.setBounds(257, 147, 171, 61);
		contentPane.add(ROLL_NO);
		ROLL_NO.setColumns(10);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete.setBackground(Color.RED);
		btnDelete.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnDelete.setBounds(257, 301, 171, 57);
		contentPane.add(btnDelete);
		
	
		btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			int r=Integer.parseInt(ROLL_NO.getText());
			try {
				StudentDao.DeleteStudent(r);
			}catch(Exception e3) {
				e3.printStackTrace();
			}
				
			}
		});
	}

}
