
public class CountNumberOfWords {
	public static void main(String[] args) {
		String s = "Windows is operating system";//4
		int cnt = getCountOfWords(s);
		System.out.println("Count of words : " + cnt);
	}
	static int getCountOfWords(String str) {
		if (str.isEmpty()) {
			return 0;
		}
		String[] w = str.split(" ");
		return w.length;
	}
}
