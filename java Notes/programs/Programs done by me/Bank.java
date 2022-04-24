import java.util.*;

class Amt{
	int acc_no;
	String name;
	float ammount;


void insert(int n,String s,float a)
{
	acc_no=n;
	name=s;
	ammount=a;

}
void display()
{
System.out.println("acc_number="+acc_no+" \n name ="+name+"\n ammount="+ammount);	
}


void deposit(int a)
{
ammount +=a;
System.out.println("balance is"+ammount);
}

void withDraw(int a)
{
	if(ammount<a)
	{
		System.out.println("IntFuccient balance");
	}
	else{
ammount -=a;
System.out.println("balance is"+ammount);
}
}

}

public class Bank
{
public static void main(String[] args) {
	Amt a=new Amt();
	a.insert(123,"mayur",100f);
	a.display();
	a.deposit(10);
	a.withDraw(110);





}

}