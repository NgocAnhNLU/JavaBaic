package week7;

import java.util.Iterator;

public class Ex15 {
	public static String upperString(String str) {
		if (str == null || str.isEmpty()) {
	        return str;
	    }
	    return str.substring(0, 1).toUpperCase() + str.substring(1);}
		
	}

