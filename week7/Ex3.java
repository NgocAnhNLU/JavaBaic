package week7;

import java.util.Iterator;

public class Ex3 {
	public static int[]  vowelsAndConsonants(String str) {
		char[] charArray = str.toCharArray();
		int count = 0, letter=0;
		
		for (int i = 0; i < charArray.length; i++) {
			if (Character.isLetter(charArray[i])) {
				letter++;
				if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'u' || charArray[i] == 'o'
						|| charArray[i] == 'i') {
					count++;
				}
			}
		}
		int[] myArray = {count,letter-count};

		return myArray;
	}
}
