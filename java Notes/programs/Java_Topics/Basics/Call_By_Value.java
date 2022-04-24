package Basics;
import java.util.*;

public class Call_By_Value {

	int data=10;
	 void change(int data)
	 {
		// data=a;
data=data+100;// changes are made to local variable only if we write(this) then the current varibale is modified to 110
	 }
	public static void main(String[] args) {
		Call_By_Value c=new Call_By_Value();
		System.out.println(c.data);
		c.change(10);
		System.out.println(c.data);
	}
}
