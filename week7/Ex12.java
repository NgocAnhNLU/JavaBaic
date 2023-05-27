package week7;

import java.util.Iterator;

public class Ex12 {
	public static String ReverseString(String str) {
		char[] reverseString =null;
		char[] charArr = str.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			reverseString[i]=charArr[str.length()-i];
		}
	return new String(reverseString);
		
	}
	

}
