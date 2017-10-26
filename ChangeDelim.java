/* 	Homework 2, Question 5
 *	@author NinnYu Chin
 *	Instruction:	Change Scanner's delimiter, and tokenize comma separated values entered by 
 *			the keyboard.
 *	Reference: https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
 */

import java.util.*;

public class ChangeDelim {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		sc.useDelimiter(",");
		sc.close();
	}
}
