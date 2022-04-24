
public class MySubString {
	public static void main(String[] args) {
		String subStr = mySubString("HandMadeSubString", 4, 11);//MadeSub
		System.out.println(subStr);
		System.out.println("HandMadeSubString".substring(4, 11));
		System.out.println("string".length());//6
	}

	static String mySubString(String s, int start, int end) {
		char[] arr = s.toCharArray();
		String output="";
		for(int i=start; i < end; i++) {
			output += arr[i];
		}
		return output;
	}
}
