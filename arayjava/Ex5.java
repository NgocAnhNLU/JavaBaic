package arayjava;

import java.util.Iterator;
import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int[] arr,arr2,indexX ;
		int size, x,coutX=0;
		boolean haveX;
		//nhap vao
		System.out.print("Enter size of arr:" );
		size=input.nextInt();
		System.out.print("Enter number X; ");
		x=input.nextInt();
		arr = new int[size];
		indexX =new int[size];
//		cho gia tri cho mang (1-10)
		for (int i=0; i < arr.length; i++) {
			arr[i]= (int) (Math.random() * 10) + 1;
		}
		for (int i : arr) {
			System.out.print(i);
		}
		System.out.println();
		for (int i=0,j = 0; i < arr.length; i++) {
			if(x==arr[i]) {
				haveX=true;
				coutX++;
//				mang luu so thu tu tu cac so bang x
				indexX[j]=i;
				j++;
			}
		}
		System.out.printf("so %d xuat hien %d lan o vi tri ",x,coutX);
		for (int i : indexX) {
			System.out.print(i);
		}
		System.out.println();
		arr2=arr.clone();
		for (int i : indexX) {
			deleteNumber(i, arr2);
		}
		for (int i : arr2) {
			System.out.print(i);
		}
		System.out.println();
		for (int i : arr) {
			System.out.print(i);
		}
		
		
		
				
				
				
				
		}
	public static  void deleteNumber(int x ,int[] arr) {
		for (int i = x; i < arr.length-1; i++) {
			arr[x]=arr[x+1];
		}
		int[] newArr = new int[arr.length-1];
		newArr =arr.clone();
		arr=newArr;
		
	}
	}

