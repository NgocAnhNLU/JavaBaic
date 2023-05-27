package week7;

import java.util.Iterator;

public class Ex11 {
	public static int PalindromeString(String str) {
		char[] charArray = str.toCharArray();
		int count = 0;

		for (int i = 0; i < charArray.length; i++) {
			if (Character.isLetter(charArray[i])) {
				// kiem tra xem co phai
				if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'u' || charArray[i] == 'o'
						|| charArray[i] == 'i') {
					count++;
				}
			}
		}

		return count;
	}
}
