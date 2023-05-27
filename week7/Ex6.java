package week7;

import java.util.Iterator;

public class Ex6 {
	// bo 1 ky tu trong chuoi
	public static String removeChar(String str, char removeChar) {
		char[] inputCharArr = str.toCharArray();
		char[] outputCharArr = new char[str.length()];
		int j = 0;
		for (int i = 0; i < str.length(); i++) {
			if (inputCharArr[i] != removeChar) {
				outputCharArr[j] = inputCharArr[i];
				j++;
			}
		}
		return new String(outputCharArr);
	}

}
