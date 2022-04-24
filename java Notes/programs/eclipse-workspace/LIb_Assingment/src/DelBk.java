import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class DelBk extends JFrame {

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
					DelBk frame = new DelBk();
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
	public DelBk() {
		JFrame frame=new JFrame();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 762, 455);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18));
		lblName.setForeground(new Color(0, 0, 0));
		lblName.setBounds(180, 29, 146, 99);
		contentPane.add(lblName);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18));
		lblId.setForeground(new Color(0, 0, 0));
		lblId.setBounds(190, 143, 146, 56);
		contentPane.add(lblId);
		
		NAME = new JTextField();
		NAME.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		NAME.setBounds(296, 60, 202, 40);
		contentPane.add(NAME);
		NAME.setColumns(10);
		
		ID = new JTextField();
		ID.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		ID.setBounds(296, 153, 202, 40);
		contentPane.add(ID);
		ID.setColumns(10);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnDelete.setBackground(Color.RED);
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {		
			}
		});
		btnDelete.setBounds(246, 254, 140, 56);
		contentPane.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String n=NAME.getText();		
				int id=Integer.parseInt(ID.getText());
				try {
					LibDao.DeLBook(n,id);
					JOptionPane.showMessageDialog(frame,"Deleted");
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
	}

}
