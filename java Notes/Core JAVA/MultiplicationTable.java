//Multiplication table(1-10) in matrix format
import java.util.*;
class MultiplicationTable {
  public static void main(String[] args) {
  	int[][] a = new int[10][10];
  	for(int i=0; i<a.length;i++) {
  		a[i] = new int[10];
  		for(int j=0; j<a[i].length;j++)
  		{
  			a[i][j] = (i+1)*(j+1);
  		}
  	}
  	//print result
  	for(int[] e : a) {
  		System.out.println(Arrays.toString(e));
  	}
  }
}