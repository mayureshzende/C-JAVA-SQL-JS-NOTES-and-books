import java.util.Arrays;
class MatrixAddition {
	public static void main(String[] args) {
		int[][] a = {{1,4,5},{6,7,2},{5,2,8}};
		int[][] b = {{3,3,9},{2,5,1},{3,0,1}};
		int[][] c = add(a,b);
		//print result
		for(int[] e: c) {
			System.out.println(Arrays.toString(e));
		}
	}

	static int[][] add(int[][]a, int[][] b) {
		int c[][] = new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++) {
			  c[i][j] = a[i][j]+b[i][j];
			}
		}
		return c;
	}
}