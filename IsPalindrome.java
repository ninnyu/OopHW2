/* Homework 2, Question 3
 * @author NinnYu Chin
 * Description: Determines whether a string is a palindrome or not.
 */

import java.util.*;

public class IsPalindrome {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		String s = sc.next();
		Boolean yes = true;
		
		for (int i = 0; i < s.length()/2; i++) {
			if (s.charAt(i) == s.charAt(s.length()-i-1) ) 
				yes = true;
			else
				yes = false;
		}
		sc.close();
		
		if (yes)
			System.out.println(s + " is a palindrome!");
		else
			System.out.println(s + " IS NOT a palindrome :(");
	}
}
