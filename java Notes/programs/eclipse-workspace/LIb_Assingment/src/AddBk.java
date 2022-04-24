import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class AddBk extends JFrame {

	private JPanel contentPane;
	private JTextField BOOK_NAME;
	private JTextField Author;
	private JTextField Book_id;
	private JTextField Price;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddBk frame = new AddBk();
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
	public AddBk() {
		JFrame frame=new JFrame();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 714, 464);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBookName = new JLabel("BOOK NAME");
		lblBookName.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18));
		lblBookName.setBounds(52, 43, 149, 51);
		contentPane.add(lblBookName);
		
		JLabel lblAuthor = new JLabel("Author");
		lblAuthor.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18));
		lblAuthor.setBounds(52, 122, 152, 29);
		contentPane.add(lblAuthor);
		
		JLabel lblBookId = new JLabel("Book Id");
		lblBookId.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18));
		lblBookId.setBounds(52, 270, 149, 32);
		contentPane.add(lblBookId);
		
		BOOK_NAME = new JTextField();
		BOOK_NAME.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18));
		BOOK_NAME.setBounds(202, 43, 221, 37);
		contentPane.add(BOOK_NAME);
		BOOK_NAME.setColumns(10);
		
		Author = new JTextField();
		Author.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18));
		Author.setBounds(202, 118, 221, 33);
		contentPane.add(Author);
		Author.setColumns(10);
		
		Book_id = new JTextField();
		Book_id.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18));
		Book_id.setBounds(202, 270, 221, 32);
		contentPane.add(Book_id);
		Book_id.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setBackground(Color.GREEN);
		btnAdd.setBounds(487, 151, 138, 59);
		contentPane.add(btnAdd);
		
		Price = new JTextField();
		Price.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18));
		Price.setBounds(202, 196, 221, 37);
		contentPane.add(Price);
		Price.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18));
		lblPrice.setBounds(52, 196, 149, 33);
		contentPane.add(lblPrice);
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String n=BOOK_NAME.getText();
				String a=Author.getText();
				float p=Float.parseFloat(Price.getText());
				int id=Integer.parseInt(Book_id.getText());
				try {
					LibDao.AddBook(n, a, p, id);
					JOptionPane.showMessageDialog(frame,"Added ");
			//		JOptionPane.showMessageDialog(null, "inserted");
					
				}catch(Exception e) {
					e.printStackTrace();
				}
						/*
						 * int r=Integer.parseInt(Roll_No.getText());
				String n=Name.getText();
				float m=Float.parseFloat(Marks.getText());
				try {
					StudentDao.AddStudent(r, n, m);
					String s="inserted";
				//	JOptionPane.showInternalMessageDialog(Frame,s);
				}catch(Exception e1) {
					e1.printStackTrace();
				}
						 */
				
			}
		});
	}
}
