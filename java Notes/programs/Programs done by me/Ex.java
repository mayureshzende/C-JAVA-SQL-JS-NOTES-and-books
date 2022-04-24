import java.util.*;

class Ex{
	public static void main(String[] args){
		
		int num = 7;

		String s = "";

		while( num > 0){
			int car = num % 2;
			num = num / 2 ;
			s += car; 
			System.out.println(" -- " + s);
		}

		System.out.println(s.length());

		for(int i = s.length()-1 ; i >= 0 ; i-- )
		System.out.print(s.charAt(i) + "");
	}
}