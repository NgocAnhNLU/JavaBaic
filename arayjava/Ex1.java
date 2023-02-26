package arayjava;

import java.util.Iterator;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int function;
//		input the size of array. 
		System.out.print("nhap vap so phan tu cua mang");
		int max = 0, size = input.nextInt();
		int[] arr = new int[size+1];
		inputArray(arr);
		System.out.println("nhap vao chuc nang muon thuc hien");
		function =input.nextInt();
		switch (function) {
		case 1:
			
			break;

		default:
			System.out.println("khong co gi o day ca");
			break;}
		}
	public static void inputArray(int[] arr) {
		Scanner input = new Scanner(System.in);
		for (int i = 1; i < arr.length; i++) {
			System.out.printf("nhap vao phan tu thu %d",i);
			arr[i] = input.nextInt();
		}
	}
	public static void findMaxNumber(int[] arr) {
		Scanner input = new Scanner(System.in);
		arr[0]=arr[1];
		for (int i = 2; i < arr.length; i++) {
			arr[0] = arr[i] > arr[0] ? arr[i] : arr[0];
		}
		System.out.println("so lon nhat la: " + arr[0]);
		
		
	}
	


}
