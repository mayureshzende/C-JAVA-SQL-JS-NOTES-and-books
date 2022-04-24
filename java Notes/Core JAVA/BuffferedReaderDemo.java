import java.io.*;

class BuffferedReaderDemo {
 public static void main(String[] args) 
 			throws IOException {
   BufferedReader br =
    new BufferedReader(new InputStreamReader(System.in));

   System.out.println("Enter ID: ");
   int id = Integer.parseInt(br.readLine());
   System.out.println("Enter name: ");
   String name = br.readLine();
   System.out.println("Enter marks: ");
   float marks = Float.parseFloat(br.readLine());
   System.out.printf("[RollNo=%d Name=%s Marks=%.2f]\n",
   					  id,name,marks);
 }
}