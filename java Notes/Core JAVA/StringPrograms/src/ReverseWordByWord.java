public class ReverseWordByWord {
	public static void main(String[] args) {
		String s = "Best Of Luck";
		String rev = reverseEachWord(s);
		System.out.println("reverse is : " + rev);
		
	}
	static String reverseEachWord(String s) {
		String[] words = s.split(" ");
		String output = "";
		for(String w: words) {
			output += reverse(w) + " ";
		}
		return output.trim();
	}
	
	static String reverse(String s) {
		char[] arr = s.toCharArray();//['m','a','c','b','o','o','k']
		for(int i=0,j=arr.length-1; i < j; i++,j--) {
			//swap
			char t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
		}
		return new String(arr);
	}
}
