//find out character with maximum occurance
public class CharWithMaxOccurance {
	public static void main(String[] args) {
		String s = "character with maximum occurances";//a-z
		char[] alphabates = new char[26];
		//initializing alphabate array
		for(int i=0; i < 26; i++) {
			alphabates[i] = (char)(97 + i);
		}
		int max = 0;
		char maxChar = ' ';
		for(int i=0 ; i < alphabates.length;i++) {
			char ch = alphabates[i];
			int cnt = 0;
			for(int j=0; j<s.length();j++) {
			  if(s.charAt(j) == ch) {
				  cnt++;
			  }
			}
			if(cnt > max) {
				max = cnt;
				maxChar = alphabates[i];
			}
			System.out.println(alphabates[i] + "=>"+cnt);
		}
		System.out.println(maxChar +" is occuring " + max + " times");
	}
}





