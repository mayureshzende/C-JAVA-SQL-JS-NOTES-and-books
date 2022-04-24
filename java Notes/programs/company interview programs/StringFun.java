import java.util.*;

class StringFun
{
	public static void main(String[] args){
		String s ="Java will be around for a while";
		String s1=new String("     Java  ");
		String s2 = s;

		System.out.println(s==s2);
		System.out.println(s==s1);
		System.out.println(s1.equals(s));
		System.out.println(s.length());

		for(int i =0 ; i < s.length() ; i++){
			System.out.print(s.charAt(i) +" ");
		}
		System.out.println();

		char[] chArr = s.toCharArray();

		System.out.println(Arrays.toString(chArr));

		String str = new String(chArr);
		System.out.println(str);

		System.out.println(s.lastIndexOf('a'));

		System.out.println(s.indexOf('x'));

		System.out.println(s.startsWith("Java"));
		System.out.println(s.endsWith("whilee"));
		System.out.println(s.contains("b")); // only string parameter allowed


		System.out.println(s.substring(5,9));

		System.out.println(s.toUpperCase());

		System.out.println(s.replace("a","o"));
		System.out.println(s);

	

		System.out.println(s1);
		System.out.println(s1.trim());

		int cnt = 0;
		for(int i = 0 ; i < chArr.length ; i++ ){
			if( 'a'== chArr[i ]){
				cnt++;
			}
		}

		System.out.println("occurence of a is " + cnt);
		

		char[] c1 = s1.toCharArray();
		for(int i = 0, j = c1.length-1 ; i < j ;j-- , i++){
			char temp = c1[i];
			c1[i] = c1[j];
			c1[j] = temp ;
		}

		String srev = new String(c1);
		System.out.println(srev.trim());	
	
		String[] sarr=s.split(" ");
		System.out.println(sarr.length); 

		String word = "";
		for(int i =0 ; i < sarr.length ; i++){
			// rev(word.append(sarr[i] + " "));\
			word = word  + rev(sarr[i]) + " ";
		} 
		System.out.println(word);

	
	}

	public static String rev(String s){
		char[] ch = s.toCharArray();

		for(int i = 0 , j = ch.length-1 ; i<j ; j-- ,i++  ){
			char temp = ch [i ];
			ch [ i ] = ch [ j ];
			ch[ j ] = temp;
		}
		return new String(ch);
	}
}