package _99_extra.recursion_practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RecursionMath {

	public static int recursiveMultiplication(int number, int times) {
		// 2. if times is 1
		// 3. return number
		if (times == 1) {
			return number;
		} else if (times == 0) {
			return 0;
		} else {

			// 4. else return number + recursionMultiplication(number, times-1)
			return number + recursiveMultiplication(number, times - 1);
		}

	}

	// 6. Try this one on your own!
	// Hint: if numberToDevideBy is bigger than number, you can't divide anymore
	public static int recursiveDivision(int number, int numberToDivideBy) {
		if (numberToDivideBy> number) {
			return 0;
		} else {
			return 1 + recursiveDivision(number-numberToDivideBy, numberToDivideBy);
		}
	}

	// 8. Try this one on your own!
	public static int recursivePower(int number, int power) {
		if (power == 0) {
			return 1;
		} else {
			return number * recursivePower(number, power - 1);
		}

	}

	@Test
	public void testMultiplication() {
		assertEquals(12, recursiveMultiplication(3, 4));
		assertEquals(81, recursiveMultiplication(9, 9));
		assertEquals(36, recursiveMultiplication(12, 3));
		assertEquals(0, recursiveMultiplication(42, 0));
		assertEquals(42, recursiveMultiplication(7, 6));

	}

	@Test
	public void testDivision() {
		assertEquals(3, recursiveDivision(12, 4));
		assertEquals(4, recursiveDivision(12, 3));
		assertEquals(9, recursiveDivision(81, 9));
		assertEquals(0, recursiveDivision(0, 42));
		assertEquals(6, recursiveDivision(42, 7));
		assertEquals(4, recursiveDivision(18, 4));
		assertEquals(5, recursiveDivision(59, 10));
	}

	@Test
	public void testPower() {
		assertEquals(9, recursivePower(3, 2));
		assertEquals(8, recursivePower(2, 3));
		assertEquals(27, recursivePower(3, 3));
		assertEquals(64, recursivePower(2, 6));
		assertEquals(16, recursivePower(4, 2));
		assertEquals(16, recursivePower(2, 4));
		assertEquals(729, recursivePower(9, 3));
	}

}
