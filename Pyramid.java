/* Homework 2, Question 1
 * @author NinnYu
 * Description: Creates a number pyramid given the number of rows.
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