//Nitin, madam 
//1221 1221

public class Palindrome {
	public static void main(String[] args) {
		String s = "Nitin";
		boolean b = isPalindrom(s);
		System.out.println(b);
	}

	static boolean isPalindrom(String s) {
		//Nitin => nitiN
		// return s.equalsIgnoreCase(ReverseString.reverse(s));
		s = s.toLowerCase();//nitin
		char[] arr = s.toCharArray();
		for(int i=0,j=arr.length-1; i<j; i++,j--) {
			if(arr[i] != arr[j]) {
				return false;
			}
		}
		return true;
	}
}
