/* 	Homework 2, Question 1
 	@author NinnYu
 	Description: 	Write a program that asks the user how tall of a pyramid do they want to 
			display on the screen, and then displays the pyramid that counts up on the 
			left, and counts down on the right. For eg, if the user enters 4, the 
			program shows:
			        1
			      1 2 1
			    1 2 3 2 1
			  1 2 3 4 3 2 1
 */

import java.util.*;

public class Pyramid {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("How tall is the pyramid?");
		int r = sc.nextInt(), n = 1;
		System.out.println("You entered: " + r + "\nHere is your pyramid.");
		
		for (int i = 0; i < r; i++) {
			//Prints white spaces.
			for (int j = 0; j < (r-i)*2; j++) {
				System.out.print(" ");
			}
			//Prints the left half of the numbers.
			for (int k = 1; k <= n; k++) {
				System.out.print(k + " ");
			}
			//Prints the right half of the numbers
			for (int l = n-1; l > 0; l--) {
				System.out.print(l + " ");
			}
			System.out.println();
			n++;
			sc.close();
		}
	}
}
