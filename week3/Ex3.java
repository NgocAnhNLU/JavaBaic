package week3;

public class Ex3 {
    public int fatherAgeXChillAge(int fatherAge, int chillAge) {
        int i;
        // C1 dung vong for diều kiện lặp cho đến khi tuổi bố gấp đôi tuổi con
        for (i = 0; (double) fatherAge / chillAge != 2.0; i++) {
            chillAge += 1;
            fatherAge += 1;
        }
        // C2 ta giai phuong tinh ta inh duoc
        // i=fatherAge-2*chillAge;
        return i;
    }
}
