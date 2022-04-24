// package 
 
 import java.util.*;

 class StackEx 
 {
 	public static void main(String[] args){
 		Stack s=new Stack();


 		s.push(1);
 		s.push(2);
 		s.push(3);
 		System.out.println(s);
 	
  		//Integer I = new Integer(1);
 		Object t = 1;
 		
 		for(int i = 0 ; i <= s.size()+1	 ; i++ ){

 			if(s.peek().equals(t) ){
 			System.out.println(s.peek() + " =" + i);
 			}else{
 			System.out.println(s.pop() + " -"+i );
 			} 		
 		}
 		System.out.println(s);
 		
  	}
 }