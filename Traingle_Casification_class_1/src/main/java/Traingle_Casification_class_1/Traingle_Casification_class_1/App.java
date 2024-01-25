package Traingle_Casification_class_1.Traingle_Casification_class_1;

/**
 * Hello world!
 *
 */

enum Triangle_Types {
	equilateral, isosceles, Scalene, Nottriangle, ERROR

}

class TriangleClassifier {

	private static Triangle_Types triangle;

	/**
	 * WHAT'S WRONG: in the first if statement: triangle should be set to
	 * equilateral if the statement was true
	 * 
	 * in the third if statement: a "!" should've been added, and what should have
	 * been checked is if the variable triangle was not a triangle
	 * 
	 * in this method, there could be a chance where negative value sides were
	 * added, then this won't be considered because there are no if statements that
	 * deal with this situation
	 * 
	 * WHAT'S ADDED: a statement that checks if at least one of the triangle sides
	 * is negative (for the sake of using the "ERROR" enumeration value, also the
	 * length of a side in a triangle can't be negative).
	 * 
	 * NEW UPDATE: the if statement that checks if the triangle has at least one
	 * negative side value has been moved up to be the first statement to be checked
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public static void classifyTriangle(int a, int b, int c) {
		if (a < 0 || b < 0 || c < 0) {
			triangle = Triangle_Types.ERROR;
		} else if (isEquilateral(a, b, c)) {
			triangle = Triangle_Types.equilateral;
		} else if (isIsosceles(a, b, c)) {
			triangle = Triangle_Types.isosceles;
		} else if (!isTriangle(a, b, c)) {
			triangle = Triangle_Types.Nottriangle;
		} else {
			triangle = Triangle_Types.Scalene;
		}

	}

	/**
	 * what's wrong: in the first return statement, it should be a+b>c testing it
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	private static boolean isTriangle(int a, int b, int c) {
		return a + b > c && a + c > b && b + c > a;
	}

	/**
	 * what's wrong: a==a isn't valid to check if the triangle is isIsosceles, also
	 * we might ignore the other statements in return in case at least one of b==c
	 * or c==a is true and return true. We can also avoid unnecessary code by
	 * replacing (a + b > c && a + c > b && b + c) with isTriangle() method.
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	private static boolean isIsosceles(int a, int b, int c) {
		return isTriangle(a, b, c) && ((a == b) || (b == c) || (c == a));
	}

	/**
	 * what's wrong: there is a messing statement: a==c
	 * 
	 * what could've been done better: replacing (a + b > c && a + c > b && b + c)
	 * with isTriangle() method.
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	private static boolean isEquilateral(int a, int b, int c) {
		return isTriangle(a, b, c) && a == b && b == c && a == c;
	}

	public static Triangle_Types get_type() {
		return triangle;
	}
}
