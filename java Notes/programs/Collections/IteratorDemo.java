import java.util.*;

 class IteratorDemo
 {
 	public static void main(String[] args) {
 			
 		ArrayList l=new ArrayList();

 		for( int i= 1 ; i<= 10 ; i++ )
 		{
 			l.add(i);
 		}

 		System.out.println(l);

 		Iterator ltr=l.iterator();
 		
 		while(ltr.hasNext())
 		{
 			Integer I=(Integer)ltr.next();
 			if( I % 2 ==0 )
 			{
 				System.out.println( " "+ I);
 			} 
 			else 
 			{
 				ltr.remove();
 			}
 		}	

 		System.out.println(l);		
 	}
 }