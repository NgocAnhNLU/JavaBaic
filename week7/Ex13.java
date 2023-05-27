package week7;

public class Ex13 {
	public static boolean checkPalindromeString(String str) {
	    // Tách chuỗi thành hai chuỗi con
	    String[] strArr = str.split("#");
	    String str1 = strArr[0];
	    String str2 = strArr[1];

	    // Kiểm tra xem hai chuỗi có độ dài bằng nhau không
	    if (str1.length() != str2.length()) {
	        return false;
	    }

	    // Đảo ngược chuỗi thứ hai
	    str2=Ex1.reverseString(str2);

	    // Kiểm tra xem hai chuỗi có giống nhau không
	    return str1.equals(str2);
	}


}
