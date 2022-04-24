package Basics;

public class Break_Stat
{
public static void main(String[] args) 
{
	aa:
		for (int i=1;i<=3;i++)
		{
			bb:
			for(int j=1;j<=3;j++)
			{
			if(i==2 && j==3)
			{
				break ;
			}
			System.out.println(i +""+ j);
		}
System.out.println();
		}
		// TODO Auto-generated constructor stub
	}

}
