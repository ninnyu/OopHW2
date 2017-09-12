/* Homework 2, Question 5
 * @author NinnYu Chin
 * Description: Changes the delimiter of a scanner object to a ",".
 * Reference: https://docs.oracle.com/javase/7/docs/api/java/util/Scanner.html
 */

import java.util.*;

public class ChangeDelim {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		sc.useDelimiter(",");
		sc.close();
	}
}
