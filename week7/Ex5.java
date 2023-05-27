package week7;

public class Ex5 {
	public static Boolean isSnagramsString(String strr) {
		String[] str = strr.split("#");
		char[] charArr1 = str[0].toCharArray();
		char[] charArr2 = str[1].toCharArray();
		if (str[0].length() != str[1].length()) {
			return false;
		}
		for (int i = 0; i < (charArr1.length / 2) - 1; i++) {
			if (charArr1[i] != charArr2[charArr1.length - i]) {
				return false;

			}
		}
		return true;
	}

} 
