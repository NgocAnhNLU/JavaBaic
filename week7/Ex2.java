package week7;

import java.util.Iterator;

public class Ex2 {
	public static Boolean PalindromeString(String str) {
	   char[] charArray = str.toCharArray();
	   for (int i = 0; i < charArray.length/2; i++) {
		   if (charArray[i]!=charArray[charArray.length-i-1]) {
			   return false;
		}
	}
	return true;
		
	}
}
