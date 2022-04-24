import java.lang.reflect.*;

class ObjMeths {
	public static void main(String[] args)throws Exception
	{

		Class c =Class.forName("java.lang.Object");
		Method[] m = c.getDeclaredMethods();

		for(Method m1 : m ){
			System.out.println("the method is "+ m1.getName());


			Class s = Class.forName("java.lang.String");
			Method[] ms = s.getDeclaredMethods();

			int cnt = 0 ; 
			
			for(Method p : ms ){
				cnt++;
				System.out.println(p.getName());
			}
			System.out.println(cnt);

		}
	}
}