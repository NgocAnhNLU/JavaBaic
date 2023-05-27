package week7;

import java.util.Iterator;

public class Ex8 {
	public static String removeFristAndEndString(String str) {
		char[] inputCharArr =new char[str.length()];
		char[] outputtCharArr =new char[str.length()-2];
		inputCharArr=str.toCharArray();
		int index=0;
		if (inputCharArr.length<3) {
			return "";
		}
		for (int i = 1; i < inputCharArr.length-1; i++) {
			outputtCharArr[index]=inputCharArr[i];
			
		}
		return new String(outputtCharArr);
		
	}

}
