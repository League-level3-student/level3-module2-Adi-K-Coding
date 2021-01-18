package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD

	@Test
	public void testLinearSearch() {
		// 1. use the assertEquals method to test your linear search method.
		String[] words = { "aa", "bb", "cc", "dd", "ee" };

		assertEquals(_00_LinearSearch.linearSearch(words, "cc"), 2);
		assertEquals(_00_LinearSearch.linearSearch(words, "ff"), -1);
		assertEquals(_00_LinearSearch.linearSearch(words, "ee"), 4);
	}

	@Test
	public void testBinarySearch() {
		// 2. use the assertEquals method to test your binary search method.
		// remember that the array must be sorted
		int[] array = { 2, 5, 19, 48, 93, 10456 };
		assertEquals(_01_BinarySearch.binarySearch(array, 0, array.length, 1), -1);
		assertEquals(_01_BinarySearch.binarySearch(array, 0, array.length, 10456), 5);
		assertEquals(_01_BinarySearch.binarySearch(array, 0, array.length, 1048772), -1);
	}

	@Test
	public void testInterpolationSearch() {
		// 3. use the assertEquals method to test your interpolation search method.
		// remember that the array must be sorted and evenly distributed
		int[] array = { 52, 104, 156, 208, 260, 312 };

		assertEquals(_02_InterpolationSearch.interpolationSearch(array, 208), 3);
		assertEquals(_02_InterpolationSearch.interpolationSearch(array, 33), -1);
		assertEquals(_02_InterpolationSearch.interpolationSearch(array, 728), -1);
		assertEquals(_02_InterpolationSearch.interpolationSearch(array, 52), 0);
	}

	@Test
	public void testExponentialSearch() {
		// 4. use the assertEquals method to test your exponential search method.
		// remember that the array must be sorted
		int[] array = { -23, 2, 5, 65, 565, 3689, 59047,59048};
		
		
		assertEquals(_03_ExponentialSearch.exponentialSearch(array, -23), 0);
		assertEquals(_03_ExponentialSearch.exponentialSearch(array, 65), 3);
		assertEquals(_03_ExponentialSearch.exponentialSearch(array, 59047), 6);
		assertEquals(_03_ExponentialSearch.exponentialSearch(array, 59048), 7);
		assertEquals(_03_ExponentialSearch.exponentialSearch(array, 59049), -1);
		assertEquals(_03_ExponentialSearch.exponentialSearch(array, -24), -1);
		assertEquals(_03_ExponentialSearch.exponentialSearch(array, -7832), -1);
	}
}
