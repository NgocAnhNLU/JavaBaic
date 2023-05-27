package week7;

import java.util.Arrays;
import java.util.Iterator;

public class Ex7 {
	// tìm ký tự xuất hiện nhiều thứ hai
	public static char findSecondMostFrequentCharacter(String str) {
		str = Ex6.removeChar(str, ' ');
		char mostChar = findMostFrequentCharacter(str);
		str = Ex6.removeChar(str, mostChar);
		System.out.println(findMostFrequentCharacter(str));
		;
		return findMostFrequentCharacter(str);
	}

	// tìm ký tự xuất hiện nhiều nhất
	public static char findMostFrequentCharacter(String str) {
		char[] arr = str.toCharArray();
		int[] count = new int[256];
		str = Ex6.removeChar(str, ' ');
		int maxCount = 0;
		char maxChar = ' ';

		for (char c : arr) {
			count[c]++;
			if (count[c] > maxCount) {
				maxCount = count[c];
				maxChar = c;
			}
		}
		System.out.println(maxChar);
		return maxChar;
	}

}