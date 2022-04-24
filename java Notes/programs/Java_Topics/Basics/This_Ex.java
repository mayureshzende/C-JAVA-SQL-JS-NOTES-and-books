package Basics;

public class This_Ex {
int id;
String name;
 void This_Ex1(int id ,String name)
{
	id=id;
	name=name;
}
void display()
{
	System.out.println(id+" "+name);
}
public static void main(String[] args) {
	This_Ex t=new This_Ex();
	t.This_Ex1(1,"name");
	t.display();
	
	 
}
}

