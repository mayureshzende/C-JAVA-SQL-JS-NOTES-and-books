package MultiThreading;
import java.util.*;
public class Thread_Sleep {
public static void main(String[] args) throws InterruptedException
{
	for(int i=1;i<=10;i++) {
		System.out.println("slide- "+i);
		Thread.sleep(2000); 
	}
}
}
