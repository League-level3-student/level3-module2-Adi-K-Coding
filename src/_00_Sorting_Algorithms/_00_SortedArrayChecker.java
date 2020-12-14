package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	// 1. Write a static method called intArraySorted.
	// This method takes in an array of integers
	// and it returns a boolean.
	// The method returns true if the integer
	// array is in ascending order and false otherwise
	static boolean intArraySorted(int[] numberList) {
		for (int i = 0; i < numberList.length - 1; i++) {
			if (numberList[i + 1] < numberList[i]) {
				return false;
			}
		}
		return true;
	}

	// 2. Write a static method called doubleArraySorted.
	// This method takes in an array of doubles
	// and it returns a boolean.
	// The method returns true if the double
	// array is in ascending order and false otherwise
	static boolean doubleArraySorted(double[] doubleList) {
		for (int i = 0; i < doubleList.length - 1; i++) {
			if (doubleList[i + 1] < doubleList[i]) {
				return false;
			}
		}
		return true;
	}

	// 3. Write a static method called charArraySorted.
	// This method takes in an array of characters
	// and it returns a boolean.
	// The method returns true if the character
	// array is in alphabetical order and false otherwise
	// (You can compare characters just like integers)
	static boolean charArraySorted(char[] charList) {
		for (int i = 0; i < charList.length - 1; i++) {
			if (charList[i + 1] < charList[i]) {
				return false;
			}
		}
		return true;
	}

	// 4. Write a static method called stringArraySorted.
	// This method takes in an array of Strings
	// and it returns a boolean.
	// The method returns true if the String
	// array is in alphabetical order and false otherwise
	// (Use the compareTo(String) method)
	static boolean stringArraySorted(String[] StringList) {
		for (int i = 0; i < StringList.length - 1; i++) {
			if (StringList[i].compareTo(StringList[i + 1]) > 0) {
				return false;
			}
		}
		return true;
	}
}
