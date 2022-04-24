public class AnagramString {
	public static void main(String[] args) {
		String s1 = "aabbcdca";//a=3,b=2,c=2,d=1
		String s2 = "abcdaabc";
		System.out.println(isAnagram(s1,s2));
	}
	static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) return false;
		for(int i=0; i<s1.length();i++) {
			char ch1 = s1.charAt(i);//'b'
			if (s2.contains(""+ch1)) {
				s2 = s2.replaceFirst(""+ch1, "");//bcda=>cd
			}else {
				return false;
			}
		}
		return s2.isEmpty();
	}
}
