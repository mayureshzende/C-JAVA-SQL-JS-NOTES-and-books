//a15bd7c- Add all digits in the string 
public class CharacterWrapperClass {
	public static void main(String[] args) {
		int sum = getSumOfDigits("a15bd7c");
		System.out.println(sum);
	}
	static int getSumOfDigits(String s) {
		int sum = 0;
		for(int i=0 ; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}
}







