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
			if (peeps.get(i) < peeps.get(i + 1)) {
				heightOfTallestPerson = peeps.get(i + 1);
			}else {
				 heightOfTallestPerson=peeps.get(i);
			}
		}
		return heightOfTallestPerson;
	}
}
