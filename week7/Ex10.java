package week7;

public class Ex10 {
	public static Boolean isAllNumber(String str) {
		char[] chaArr = str.toCharArray();
		for (int i = 0; i < chaArr.length; i++) {
			if ((int) chaArr[i] < 48 & (int) chaArr[i] > 57) {
				return false;

			}
		}
		return true;

	}

}
