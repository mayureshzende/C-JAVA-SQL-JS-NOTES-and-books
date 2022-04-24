//input:  immutability
//output: miumatibilyt
//abcde  badce
//abcdef badcfe
//123456 214365
public class SwapAlternateChars {
	public static void main(String[] args) {
		String s = "immutabilit";
		String output = swapAlternateChars(s);
		System.out.println(output);
	}

	static String swapAlternateChars(String s) {
		char[] arr = s.toCharArray();
		for(int i=0,j=1; j < arr.length; i+=2,j+=2) {
			char t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
		}
		return new String(arr);
	}
}




