//Best of luck
//tseB fo kcul

public class ReverseString {
	public static void main(String[] args) {
		String s = "macbook";
		String rev = reverse(s);
		System.out.println("reverse is : " + rev);
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
