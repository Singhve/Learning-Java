package Day2;

import java.util.Scanner;

public class WeekdaySwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int weekday;
		Scanner s=new Scanner(System.in);
		System.out.println("Pick a number: ");
		weekday =s.nextInt();
		switch (weekday){
		
		case 1:
			System.out.println("Monday"); break;
			
		case 2:
			System.out.println("Tuesday"); break;
		
		case 3:
			System.out.println("Wednesday"); break;
		
		case 4:
			System.out.println("Thursday"); break;
			
		case 5:
			System.out.println("Friday"); break;
			
		case 6:
			System.out.println("Saturday"); break;
			
		case 7:
			System.out.println("Sunday"); break;
		
		default:
			System.out.println("Please choose a valid number: 1-7");
		
		
		
		}
	}

}
