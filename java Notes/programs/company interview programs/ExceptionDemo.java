//package com.exception

class ExceptionDemo	{
	public static void main(String[] args){
		int ans = 0;
		try{
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);

			ans =n1/n2 ; 
		}catch(Exception e){
			System.out.println("some exception occured");
		}
		// catch(ArrayIndexOutOfBoundsException ae){
		// 	ae.printStackTrace();
		// }catch(NumberFormatException ne){
		// 	System.out.println("please pass numbers");
		// 	// ne.printStackTrace();
		// 	System.exit(0);

		// }
		finally{
			System.out.println("finally executed");
		}

		System.out.println("divison is "+ ans);
	}
}