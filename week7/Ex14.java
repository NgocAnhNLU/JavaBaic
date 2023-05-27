package week7;

public class Ex14 {
	public static String removeChar(String str) {
		char[] inputCharArr = str.toCharArray();
		char[] outputCharArr = new char[str.length()];
		int j = 0;
		for (int i = 0; i < str.length(); i++) {
			if (inputCharArr[i] != ' ') {
				outputCharArr[j] = inputCharArr[i];
				j++;
			}
		}
		return new String(outputCharArr);
	}

}
