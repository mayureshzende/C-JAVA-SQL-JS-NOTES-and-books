import java.util.*;

class WeekDayCalculate
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();

		String[] arrOfWeek = { " Monday " , " TuesDay "  , "Wednesday" , " Thursday " , " Friday "
		 , " Saturday " , "Sunday"} ;

		 if( ch <= 7 & ch >=1 ){
		 System.out.println(arrOfWeek[ch-1]);
		}
		else
		{
			System.out.println(" enter the day between 1- 7 ");
		}

	// 	do{
	// 		System.out.println(" enter the number to get day of week ");
	// 		int n=sc.nextInt();
	// 	switch(n)
	// 	{
	// 		case 1:
	// 		System.out.println(" Monday ");
	// 		break;
	// 		case 2:
	// 		System.out.println(" Tuesday ");
	// 		break;
	// 		case 3:
	// 		System.out.println(" Wednesday ");
	// 		break;
	// 		case 4:
	// 		System.out.println(" Thursday ");
	// 		break;
	// 		case 5:
	// 		System.out.println(" Friday ");
	// 		break;
	// 		case 6:
	// 		System.out.println(" Saturday ");
	// 		break;
	// 		case 7:
	// 		System.out.println(" Sunday ");
	// 		break;
	// 		default:
	// 		System.out.println(" enter the valid number between 1 - 7 ");
	// 		break;
	// 	}
	// 	System.out.println(" do ypu want to continue press a | A " );
	// 	ch = sc.next().charAt(0);
	// }
	// while( ch == 'a' || ch == 'A' );

		sc.close();
	}
}