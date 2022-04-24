import java.util.*;

class Cmd{
	public static void main(String[] args){
	if(args.length < 2){
		System.out.println("enter both the parameter ");
		System.exit(0);
		}

		int id = Integer.parseInt(args[0]);
		String name= args[1];

			Test t1= new Test(id,name);

			System.out.println(t1);

	}	
}

class Test {
	private int id;
	private String name;
	Test(){	}

	Test(int id,String name){
		this.id=id;
		this.name=name;
	}

	public String toString(){
		return "id = " + id +" name is "+ name ;
	}
}