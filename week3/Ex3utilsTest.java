package week3;

import java.util.Iterator;

public class Ex3utilsTest {
	public static void main(String[] args) {
		Ex3 ex3 =new Ex3();
		int old[][]= {{34,4},{35,7},{30,10}};
		for (int[] is : old) {
			System.out.printf("nay bo %2d tuoi, con %2d tuoi thi sau %d nam nua tuoi bo se gap doi tuoi con\n",is[0],is[1],ex3.oldFatherX2OldChill(is[0], is[1]));
			}
		}
	}

