package Collections;
import java.util.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;


public class PropertiesDBDemo {
public static void main(String[] args) throws Exception {
	
	Properties p=new Properties();
	
	FileInputStream fis=new FileInputStream("db.properties");
	p.load(fis);
	
	String url=p.getProperty("URL");
	String user=p.getProperty("user");
	String pwd=p.getProperty("pwd");
	
	Connection con=DriverManager.getConnection(url,user,pwd);
	
}
}
