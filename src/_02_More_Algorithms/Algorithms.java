package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return -1;
	}

	public static Object countPearls(List<Boolean> oysters) {
		int numOfPearls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i) == true) {
				numOfPearls = numOfPearls + 1;
			}
		}
		return numOfPearls;
	}

	public static double findTallest(List<Double> peeps) {
		double heightOfTallestPerson = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > heightOfTallestPerson) {
				heightOfTallestPerson = peeps.get(i);
			}
		}
		return heightOfTallestPerson;
	}

	public static Object findLongestWord(List<String> words) {
		String longestWord = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longestWord.length()) {
				longestWord = words.get(i);
			}
		}
		return longestWord;
	}

	public static Object containsSOS(List<String> message1) {
		for (int i = 0; i < message1.size(); i++) {
			if (message1.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<String> sortScores(List<Double> results) {
		boolean isInOrder = false;
		while (isInOrder == false) {
			isInOrder = true;
			for (int i = 0; i < results.size() - 1; i++) {
				if (results.get(i + 1) < results.get(i)) {
					double temp = results.get(i);
					results.get(i) = results.(i + 1);
					results.get(i + 1) = temp;
					isInOrder = false;
				}
			}
		}
	}
}
