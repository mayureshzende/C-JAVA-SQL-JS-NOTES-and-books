//we are writing string programs
//programs string writing are we

public class ReverseSequenceOfWords {
	public static void main(String[] args) {
		String s = "we are writing string programs";
		String rev = reverseSequence(s);
		System.out.println(rev);
	}
	static String reverseSequence(String s) {
		String[] words = s.split(" ");
		for(int i=0,j=words.length-1; i < j; i++,j--) {
			String t = words[i];
			words[i] = words[j];
			words[j] = t;
		}
		return String.join(" ", words);//joining all words with space
	}
}

