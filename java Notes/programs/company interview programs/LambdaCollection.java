// package coom.lambda.collections
import java.util.*; 

class Mycompar implements Comparator<Integer> {

	public int compare(Integer I1, Integer I2 ){
		
		return (I1<I2) ? -1 : (I2>I2)?+1:0;
		 // if (I1 < I2 ){
		 // 	return -1 ;
		 // }else if(I1 > I2){
		 // 	return +1;
		 // }else {
		 // 	return 0 ;
		 // }
	} 
} 


class LambdaCollection{
	public static void main(String[] args ){
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20 );
		al.add(0);
		al.add(15);
		al.add(35);
		System.out.println(al);

		// Collections.sort(al,new Mycompar());  using the lambda Expression for the comparator 
		Comparator<Integer> c = (I1,I2) -> (I1<I2)?-1:(I1>I2)?+1:0 ;
		Collections.sort(al,c);

		System.out.println(al);
	}
}