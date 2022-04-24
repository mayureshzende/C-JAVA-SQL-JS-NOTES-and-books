import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Search_Bk extends JFrame {

	private JPanel contentPane;
	private JTextField NAME;
	private JTextField ID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search_Bk frame = new Search_Bk();
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
	public Search_Bk() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 724, 450);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		ID = new JTextField();
		ID.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 21));
		ID.setBounds(306, 135, 217, 34);
		contentPane.add(ID);
		ID.setColumns(10);
		
		
		
		JLabel lblId = new JLabel("AUTHOR");
		lblId.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18));
		lblId.setBounds(190, 125, 124, 50);
		contentPane.add(lblId);
		
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18));
		lblName.setBounds(185, 49, 129, 50);
		contentPane.add(lblName);
		
		NAME = new JTextField();
		NAME.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 21));
		NAME.setBounds(306, 59, 217, 34);
		contentPane.add(NAME);
		NAME.setColumns(10);
		
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBackground(Color.ORANGE);
		btnSearch.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearch.setBounds(246, 268, 222, 55);
		contentPane.add(btnSearch);
		btnSearch.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String n=NAME.getText();
				String a=ID.getText();				
				try {
					LibDao.SearchBk(n,a);
					
						
				}catch(Exception e3) {
					e3.printStackTrace();
				}
			}
		});
	}

}
