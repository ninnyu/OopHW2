/* 	Homework 2, Question 6
 * 	@author NinnYu Chin
 * 	Instruction: 	Your job is to tokenize individual characters. Your code looks like:
 *			Scanner in = ...
 *			in.useDelimiter()
 *			while(in.hasNext()){
 *				print the current token.
 *			}
 *			What delimiter should you use here?
 * 	Reference: 	https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
 */

import java.util.*;

public class ChangeDelim2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		sc.useDelimiter("."); 					//Changes the delimiter to any character. But I'm not sure if that's what you wanted.
		//sc.useDelimiter("[a-zA-Z0-9]");		Or this this what you meant? Letters and numbers?

		while (sc.hasNext())
			System.out.print(sc.next());
		
		sc.close();
	}
}
