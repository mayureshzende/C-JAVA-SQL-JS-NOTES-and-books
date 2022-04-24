class StaticCountTest {
 public static void main(String[] args) {
 	System.out.println(Abc.count);//0
 	Abc obj1 = new Abc();//obj1.x = 2
 	Abc obj2 = new Abc(10);//obj2.x = 10
 	System.out.println(Abc.count);//2
 	Abc obj3 = new Abc();//obj3.x = 2
 	Abc obj4 = new Abc(20);//obj4.x = 20
 	System.out.println(Abc.count);//4
 	System.out.println(obj1.count);//4
 //System.out.println(obj1.x+obj2.x+obj3.x+obj4.x+Abc.count);
 System.out.println(obj1.x+obj2.x+obj3.x+obj4.x+Abc.count);
 	//2+10+2+20+4
 }
}

class Abc {
  static int count;
  int x = 2;
  Abc() {
  	Abc.count++;
  }
  Abc(int x) {
  	Abc.count++;//OR this();--call to default constructor
  	this.x = x;
  }
}





