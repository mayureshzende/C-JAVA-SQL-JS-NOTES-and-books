import java.util.*;

class NumberOfDays
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println(" enter the  month ");
		int month=sc.nextInt();

		String mname="";
		int days=0;

		System.out.println(" enter the  year ");
		int year= sc.nextInt();

		switch(month)
		{
			case 1:
			mname = " january ";
			days=31;
			break;

			case 2:
			mname = " February ";
			if( ( year % 400 == 0 || year%4 == 0 ) && (year % 100 != 0 ) )
				{
					days=29;
				}else
				{
					days= 28;
				}
			break;

			case 3:
			mname = " March ";
			days=31;
			break;

			case 4:
			mname = " April ";
			days=30;
			break;

			case 5:
			mname = " May ";
			days=31;
			break;

			case 6:
			mname = " June ";
			days=30;
			break;
				
			case 7:
			mname = " July ";
			days=31;
			break;
			
			case 8:
			mname = " August ";
			days=31;
			break;

			case 9:
			mname = " September ";
			days=30;
			break;

			case 10:
			mname = " October ";
			days=31;
			break;	

			case 11:
			mname = " November ";
			days=30;
			break;

		    case 12:
			mname = " Demcember ";
			days=31;
			break;

			default:
			System.out.println(" enter the valid month ");
			break;
		}

		System.out.println(" maonth is " + mname + " and days are " + days);

		sc.close();

	}
}