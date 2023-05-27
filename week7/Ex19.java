package week7;

public class Ex19 {
	public static String joinStrings(String input) {
	    String[] strArr = input.split("#");
	    String result = strArr[0].concat(strArr[1]);
	    return result;
	}

}
