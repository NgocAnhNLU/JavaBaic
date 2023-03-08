package week3;

public class Ex3 {
        public int oldFatherX2OldChill(int oldFather ,int oldChill ) {
        	int i;
        // diều kiện lặp cho đến khi tuổi bố gấp đôi tuổi con
//        for (i = 0; (double) oldFather / oldChill != 2.0; i++) {
//            oldChill += 1;
//            oldFather += 1;
//        }
//        giai phuong tinh ta inh duoc 
        i=oldFather-2*oldChill;
        return i;
    }
}
