
public class EqualsIgnoreCaseDemo {
	public static void main(String[] args) {
		boolean b = myEqualsIgnoreCase("sTrIng", "StrInG");//true
		System.out.println(b);
		
	}

//	static boolean myEqualsIgnoreCase(String s1, String s2) {
//		s1 = s1.toLowerCase();//pga
//		s2 = s2.toLowerCase();//pga
//		return s1.equals(s2);
//	}
	static boolean myEqualsIgnoreCase(String s1, String s2) {
		char [] arr1 = s1.toCharArray();//sTrIng
		char [] arr2 = s2.toCharArray();//StrInG
		if(arr1.length != arr2.length) return false;
		for(int i=0 ; i < arr1.length; i++) {
			char ch1 = arr1[i];
			char ch2 = arr2[i];
			//A-Z 65-90 a-z 97-122
			if(ch1 == ch2 || ch1 == ch2 + 32 || ch1 == ch2-32) {
				continue;
			}else {
				return false;
			}
		}
		return true;
	}
}



