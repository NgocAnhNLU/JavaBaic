package week7;

import java.util.Iterator;

public class Ex17 {
	public static String  getAllSubstrings(String str) {
		char[] charArr=str.toCharArray(),tempChar = null	;
		String[] word = null;
		int index=0;
		for (int i = 0; i < charArr.length; i++) {
			for (int j = 0; j < charArr.length; j++) {
				for (int j2 = 0; j2 <=i; j2++) {
					tempChar[j2]=charArr[j];
				}
				word[index]= new String(tempChar);
				index++;
			}
		}
		return new String(String.join(" ", word));
	}

}
