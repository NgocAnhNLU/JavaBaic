package arayjava;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int function;
		// input the size of array.
		System.out.print("nhap vap so phan tu cua mang");
		int max = 0, size = input.nextInt();
		int[] arr = new int[size + 1];
		inputArray(arr);
		featureTable();
		function = input.nextInt();
		switch (function) {
			case 1:
				findMaxNumber(arr);
				break;
			case 2:
				avgNumArray(arr);
				break;
			case 6:
				sumEvenNumArray(arr);
				break;
			case 7:
				findMax2Number(arr);
				break;
			case 9:
				coutNum(arr);
				break;
			case 10:
				sum2Num(arr);
				break;
			case 11:
				System.out.println(sumArray(arr));
				break;
			default:
				System.out.println("khong co gi o day ca");
				break;
		}
	}

	public static void inputArray(int[] arr) {
		Scanner input = new Scanner(System.in);
		for (int i = 1; i < arr.length; i++) {
			System.out.printf("nhap vao phan tu thu %d la: ", i);
			arr[i] = input.nextInt();
		}
	}

	public static void featureTable() {
		System.out.println("nhap 1: để tìm số lớn nhất trong dãy");
		System.out.println("nhap 2: để tính trung bình cộng của dãy");
		System.out.println("nhap 3:");
		System.out.println("nhap 4: kiểm tra xem một mảng số nguyên có phải là một dãy tăng dần hay không");
		System.out.println("nhap 5:");
		System.out.println("nhap 6: tính tổng các số chẵn trong một mảng số nguyên.");
		System.out.println("nhap 7: tìm phần tử lớn thứ hai trong một mảng số nguyên");
		System.out.println("nhap 8:");
		System.out.println("nhap 9:số lần xuất hiện của một phần tử xác định trong một mảng số nguyên");
		System.out.println(
				"nhap 10:Viết chương trình tìm hai phần tử trong một mảng số nguyên có tổng bằng một số nguyên xác định");
		System.out.println("nhap 11: tinh tong ");

	}

	// find number max in array
	public static void findMaxNumber(int[] arr) {
		Scanner input = new Scanner(System.in);
		arr[0] = arr[1];
		for (int i = 2; i < arr.length; i++) {
			arr[0] = arr[i] > arr[0] ? arr[i] : arr[0];
		}
		System.out.println("so lon nhat la: " + arr[0]);

	}

	// Sum number in array
	public static int sumArray(int[] arr) {
		int sum = 0;
		for (int i = 1; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;

	}

	// avg for number in array
	public static void avgNumArray(int[] arr) {
		double avg;
		avg = (double) sumArray(arr) / (arr.length - 1);
		System.out.print("trung binh cong phan tu trong day la:" + avg);

	}

	// reverse the order of the elements
	public static void reverseArray(int[] arr) {
		arr[0] = arr[1];
		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[arr.length - i];

		}

	}

	// number of increases
	public static void numOfIncreases(int[] arr) {
		boolean status = true;
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				status = false;
				break;
			}
		}
		if (status == true) {
			System.out.println("chuoi la chuoi tang dan");
		} else {
			System.out.println("chuoi khong phai la chuoi tang dan");
		}
	}

	// sum 2 number = input
	public static void sum2Num(int[] arr) {
		int sum, num;
		Scanner input = new Scanner(System.in);
		System.out.print("Input number: ");
		num = input.nextInt();
		for (int i = 1; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				sum = arr[i] + arr[j];
				if (sum == num) {
					System.out.printf(" %d va %d la %d\n", arr[i], arr[j], num);
				}
			}

		}

	}

	// số lần xuất hiện của một phần tử xác định trong một mảng số nguyên
	public static void coutNum(int[] arr) {
		int cout = 0, num;
		Scanner input = new Scanner(System.in);
		System.out.print("Input number: ");
		num = input.nextInt();
		for (int i = 1; i < arr.length; i++) {
			if (num == arr[i]) {
				cout++;
			}

		}
		System.out.printf("so lan xuat hien cua %d la %d lan",num,cout);

	}
	//bai6 
	public static void sumEvenNumArray(int[] arr) {
		int sum=0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]%2==0) {
				sum+=arr[i];
			}
		}
		System.out.println("tong cac so chan cua day la: "+sum);
		
	}
	// find number max in array
	public static void findMax2Number(int[] arr) {
		int[] arrClond=arr.clone();
		arrangeToBeHigh(arrClond);
		System.out.print("so lon thu 2 la so "+arrClond[arrClond.length-1]);
		
		
	}
	// sapxep
	public static void arrangeToBeHigh(int[] arr){
		for (int i = 1; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length-1; j++) {
				if (arr[i]>arr[i]) {
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}

		}
	}
}
	
