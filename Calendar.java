/* Homework 2, Question 2
 * @author NinnYu Chin
 * Description:	Creates a calendar given the year and the first day of the year. 
 */


import java.util.*;

public class Calendar {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("What is the year of the calendar you want?");
		int year = sc.nextInt();
		System.out.println("In number form, what day of the week is January 1st on? (1 being Sunday and 7 being Saturday)");
		int firstDay = sc.nextInt();
		int dayCounter = firstDay;
		System.out.println();

		String[] months = {"January", "February", "March", "April",
							"May", "June", "July", "August",
							"September", "October", "November", "December"};
		String weekdays = " Su Mo Tu We Th Fr Sa";
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for (int i = 0; i < 12; i++) {
			if ( ( ( (year % 4 == 0) && (year % 100 != 0) ) || (year % 400 == 0) )
					&& (i == 1) ) {
				days[i] = 29;
			}
			
			System.out.printf("     %s %d%n", months[i], year);
			System.out.printf("%s%n", weekdays);
			
			for (int space = 1; space <= firstDay; space++) {
				System.out.print("   ");
            }
			
            for (int j = 1; j <= days[i]; j++) {
            	dayCounter++;
            	if ( dayCounter % 7 == 0)
            		System.out.printf("%3d%n", j);
            	else
            		System.out.printf("%3d", j);
            }
            
            firstDay = (firstDay + days[i]) % 7;
            System.out.println("\n");
            sc.close();
		}
	}
}
