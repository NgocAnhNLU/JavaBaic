package week7;

public class Ex20 {
	public static String removeSpecialChars(String str) {
	    // chỉ định các ký tự hợp lệ bằng biểu thức chính quy
	    String validCharsRegex = "[^a-zA-Z0-9]";
	    // thay thế các ký tự không hợp lệ bằng chuỗi trống
	    return str.replaceAll(validCharsRegex, "");
	}


}
