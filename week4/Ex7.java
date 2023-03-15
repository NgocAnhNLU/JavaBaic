package week4;import javax.swing.plaf.multi.MultiInternalFrameUI;

public class Ex7 {
	public static boolean isSymmetric(int[] arr) {
		  // check if array is empty
		  if (arr == null || arr.length == 0) {
		    return false;
		  }
		  // loop through half of the array
		  for (int i = 0; i < arr.length / 2; i++) {
		    // compare the elements at symmetric positions
		    if (arr[i] != arr[arr.length - i - 1]) {
		      return false;
		    }
		  }
		  return true;
		}
	public static boolean  isAlternatingSequence(int[] arr ) {
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]*arr[i+1]>=0) {
				return false;
			}
		}
		return true;
	}

}
