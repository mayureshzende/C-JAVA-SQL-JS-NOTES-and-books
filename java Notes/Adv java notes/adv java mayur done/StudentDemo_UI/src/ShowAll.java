import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;
//import java.awt.List;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Component;

import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.GridLayout;

import javax.swing.JScrollPane;
import java.sql.*;

public class ShowAll extends JFrame {

	private JPanel contentPane;
	private JFrame Frame;
	private JTable Column;
	private JScrollPane scrollPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowAll frame = new ShowAll();
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
	Connection con=null;
	public ShowAll() {
		Frame=new JFrame();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 983, 594);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(175, 102, 452, 402);
		contentPane.add(scrollPane);
		
		Column = new JTable();
		scrollPane.setViewportView(Column);
		//String[] Column={"id","NAME","Marks"};
		//List<Student> list=null;
		try {
		//	list=StudentDao.getAllStudent();
			Connection con=Dbutil.getconnection();
			//String sql="select * from student order by id";
			Statement st=con.createStatement();
		//	ResultSet rs=st.executeQuery(sql);
			
			
			
			
			
			String sql="select * from student order by id";
			//Statement st=con.creaStatement();
			ResultSet rs=st.executeQuery(sql);
			Column.setModel(DbUtils.resultSetToTableModel(rs));
		}catch(Exception e4) {
			e4.printStackTrace();
			
		}
//	String[][] data=new String[list.size()][3];
//		for(int i=0;i<list.size();i++)
//		{
//			Student s=list.get(i);
//			data[i][0]=Integer.toString(s.getId());
//			data[i][1]=" "+s.getName();
//			data[i][2]=" "+s.getMarks();
//		}
//		JTable table=new JTable(data,Column);
//		Frame.getContentPane().add(table);

	//	JTable tbl = new JTable(data,columnNames);
	//	JScrollPane jsp = new JScrollPane(table);
 		
		
	}
}
