import java.util.*;

class TwoDArray {
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
  	System.out.println("Enter row count:");
  	int n = sc.nextInt();
  	System.out.println("Enter column count:");
  	int m = sc.nextInt();


  	int[][] a = new int[n][m];//2 D array
    System.out.println(" a length is "+a.length);

  	for(int i=0 ; i < a.length; i++) {
  	  a[i] = new int[m];//1-D array
  	  System.out.printf("Enter %d numbers for row %d:",m,(i+1));
  	  for(int j=0;j<a[i].length;j++) {
  	  	a[i][j] = sc.nextInt();
  	  }
  	}
  	//print 2-D array using toString
  	for(int i=0; i<a.length;i++) {
  		System.out.println(Arrays.toString(a[i]));
  	}
  	//Traversing 2-D array element by element
  	for(int i=0; i<a.length;i++) {
  		for(int j=0;j<a[i].length;j++) {
  			System.out.print(a[i][j]+ " ");
  		}
  		System.out.println();
	}
  }
}









