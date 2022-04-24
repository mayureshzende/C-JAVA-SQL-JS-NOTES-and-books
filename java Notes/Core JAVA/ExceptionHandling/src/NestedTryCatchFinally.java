	//java NestedTryCatchFinally try catch nested
	public class NestedTryCatchFinally { 
		public static void main(String[] args) {
			try {
				System.out.println(args[0]);//try
						try 
						{
							System.out.println(args[1]);//catch
							System.out.println(args[1].charAt(4));//h
						}catch(ArrayIndexOutOfBoundsException e) 
						{
							System.out.println("3");
							System.out.println(args[3]);
						}finally 
						{
							System.out.println("6");//6
						}

				System.out.println("4");//4
				}
			catch(StringIndexOutOfBoundsException e) 
			{
				System.out.println("2");
			}catch(Exception e2) 
			{
				System.out.println("1");
			}finally
			{ 
				System.out.println("5");  
			}
			System.out.println("End");
		}
	}


/** 
blank 
nested
nested try 
try catch nested

*/