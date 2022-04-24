    
// 22:22
// ​01234  
// 12:12
// ​
// 12:34

// 07:15
// 01234
import java.util.Scanner;

class Ecs {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String UserIn = sc.next();

		char[] cArr = UserIn.toCharArray();	

				if( cArr[0] == cArr[1] && cArr[0] == cArr[3] && cArr[0] == cArr[4] ){
					System.out.println("all digits are same");
				}
				else if( cArr[0] == cArr[3] && cArr[1] == cArr[4] ){
				
				System.out.println(" hours and mintues are same ") ;
				
				}else {

					System.out.println(" different digits ");
			}
	}
}
