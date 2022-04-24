import java.io.*;
public class CheckedExceptionTest {
   public static void main(String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int [] arr = new int[3];
	System.out.println(arr[9]);
        System.out.println("Enter your name");
	try {
	String name = br.readLine();
	System.out.println("Your name is " + name);
	}catch(IOException e) {System.out.println("IOexception occurred"); }
   }
}
