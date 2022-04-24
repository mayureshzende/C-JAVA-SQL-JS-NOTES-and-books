//package ]

class Gen {
	public static void main(String args[]){
	
		Test<Integer> I = new Test<Integer>(10);
		I.show();
		System.out.println( I.getObj() );

		Test<Float> I1 = new Test<Float>(10.0f);
		I1.show();
		System.out.println( I1.getObj() );     

		Integer i =new Integer(10); 
		System.out.println(" =========== "+ i.getClass().getName());
	}
}


class Test<T>{
	T obj;

	Test(T obj){
		this.obj = obj ;
	}


	public void show(){
		System.out.println(" obj of type " + obj.getClass().getName());
	}

	public T getObj(){
		return obj;
	}
}