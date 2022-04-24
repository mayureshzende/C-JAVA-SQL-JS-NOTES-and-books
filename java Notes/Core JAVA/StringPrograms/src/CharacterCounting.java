public class CharacterCounting {
	public static void main(String[] args) {
		String s = "We started using eclipse";
		//count of char 'e'
		int cnt = countOfChar(s,'e');
		System.out.println("cnt=" + cnt);
	}
	
	static int countOfChar(String str, char ch) {
		int cnt = 0;
		for(int i=0 ; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
				cnt++;
			}
		}
		return cnt;
	}
}
