 //Print Prime numbers between 1 to 100
class Prime {
 public static void main(String[] args) {
 	Prime.findPrimeFromRange(1,100);
 }
 static void findPrimeFromRange(int from, int to) {
 	for(int i=from; i<=to; i++) {
 		if(Prime.isPrime(i)) {
 		 System.out.println(i+" is Prime");
 		}
 	}
 }

 static boolean isPrime(int n) {
 	if(n < 2) { return false; }
 	for(int i=2; i <= n/2; i++) {
 		if(n%i == 0) {
 			return false;
 		}
 	}
 	return true;
 }
}





