package week7;

import java.util.Iterator;

public class ex4 {
	public static String LargestWord(String str) {
		String longesWord = "";
		String[] word=str.split(" ");
		longesWord=word[0];
		for (int i = 1; i < word.length-1; i++) {
			if (word[i].length()>longesWord.length()) {
				longesWord=word[i];
			}
		}
		return longesWord;

	}

}
