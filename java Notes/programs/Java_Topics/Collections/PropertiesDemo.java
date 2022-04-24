package Collections;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;
public class PropertiesDemo {
public static void main(String[] args) throws Exception {
	
	Properties p=new Properties();
	
	FileInputStream fis=new FileInputStream("abc.properties");
	p.load(fis);
	System.out.println(p);
	
	String s=p.getProperty("Chiku");
	System.out.println("property for chiku is= "+s);
	
	p.setProperty("saksham","9999");
	p.setProperty("sakshi","2@@@");
	FileOutputStream fos=new FileOutputStream("abc.properties");
	
	p.store(fos,"update by mayur for saaksham");
	
	
}
}

