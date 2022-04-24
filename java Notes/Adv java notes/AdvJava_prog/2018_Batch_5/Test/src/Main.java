import java.io.File;
import java.io.FileWriter;
import java.io.*;
public class Main {
 public static void main(String[] args) throws Exception {
	  FileWriter w = new FileWriter(new File("/tmp/count.txt"));
	  
//	  Integer count = "5";
	  BufferedWriter bw = new BufferedWriter(w);
	  bw.write("5");
	  bw.close();
}
}
