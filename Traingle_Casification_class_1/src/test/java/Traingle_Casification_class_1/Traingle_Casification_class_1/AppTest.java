package Traingle_Casification_class_1.Traingle_Casification_class_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

	TriangleClassifier triangle = new TriangleClassifier();

	/**
	 * Checks if the triangle is equilateral
	 */
	@Test
	public void equilateralTriangle() {
		int a = 2;
		int b = 2;
		int c = 2;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.equilateral.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected, result.toString());
	}

	/**
	 * a test that checks if the run was completed successfully if the sides values
	 * assigned to the 3 variables represent a isosceles
	 */
	@Test
	public void isoscelesTriangle() {
		int a = 3;
		int b = 6;
		int c = 6;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.isosceles.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected, result.toString());
	}

	/**
	 * a test that checks if the run was completed successfully if the sides values
	 * assigned to the 3 variables represent a Scalene triangle
	 */
	@Test
	public void ScaleneTriangle() {
		int a = 3;
		int b = 6;
		int c = 4;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.Scalene.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected, result.toString());
	}

	/**
	 * a test that checks if the run was completed successfully if the sides values
	 * assigned to the 3 variables don't represent a triangle
	 */
	@Test
	public void Nottriangle() {
		int a = 3;
		int b = 8;
		int c = 2;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.Nottriangle.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected, result.toString());
	}

	/**
	 * a test that checks if the run was completed successfully if sides values
	 * assigned to the 3 variables have no meaning in geometry
	 */
	@Test
	public void Error() {
		int a = -2;
		int b = 1;
		int c = 4;
		triangle.classifyTriangle(a, b, c);
		String expected = Triangle_Types.ERROR.toString();
		String result = triangle.get_type().toString();
		assertEquals(expected, result.toString());
	}
}