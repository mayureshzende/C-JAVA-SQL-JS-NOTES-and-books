package Collections;
import java.util.*;

public class Stack_Demo_1 {

	public static void main(String[] args) {
		
	Stack s=new Stack();
	s.push("A");
	s.push("B");
	s.push("c");
	
	System.out.println(s);//[A,B,C] index [0,1,2]  Offset [1,2,3]
	System.out.println(s.search("A"));//returns offset
	System.out.println(s.search("Z"));//returns the offset
	
	s.pop();
	s.pop();
	System.out.println(s.peek());
	s.pop();
	
	System.out.println(s);
	System.out.println(s.isEmpty());

	if(s.isEmpty())
	{
		s.push("mayur");
	}
	else
	{
		s.pop();
	}
	System.out.println(s);
	
	
	}
	
}
