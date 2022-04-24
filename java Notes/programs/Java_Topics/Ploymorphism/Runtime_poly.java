package Ploymorphism;
class vehicle
{
	void run() {
		System.out.println("vehicle is running");
	}
}

class activa extends vehicle
{
//	void run()
//	{
//		System.out.println("actuva is running");
//	}
}

public class Runtime_poly {
public static void main(String[] args) {
	vehicle v=new activa();
	v.run();
}
}
