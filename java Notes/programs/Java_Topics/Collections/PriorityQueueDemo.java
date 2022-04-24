package Collections;

import java.util.*;

public class PriorityQueueDemo {

	public static void main(String[] args) {
	
	PriorityQueue q=new PriorityQueue();
	System.out.println(q.peek()); //null
	//System.out.println(q.element()); //Re NoSuchElementException for empty queue
	
	for(int i=0;i<=10;++i)
	{
		q.offer(i);
	}
	
	System.out.println(q);
	System.out.println(q.poll()); //removes and return the head element 
	
	System.out.println(q);

	}

}
