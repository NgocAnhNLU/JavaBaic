package week7;

public class Ex16 {
	public static Boolean isPalindrome(String str) {
		String palindromeString =Ex1.reverseString(str);
		return str.equals(palindromeString);
		
	}

}
