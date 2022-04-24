import java.util.*;

class SystemProp
{
	public static void main(String[] args)
	{
		System.out.println("java version"+System.getProperty("java.version"));
		System.out.println("JAVA runtime version "+ System.getProperty("java.runtime.version"));
		System.out.println("java Home is"+ System.getProperty("java.home"));

		System.out.println("java class path "+ System.getProperty("java.class.path"));
	}
}