package baiTap;

import java.util.Scanner;

/**
 * Câu 5
 */
public class Cau5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//B1: Nhập số N
		System.out.println("Xin vui lòng nhập độ dài mảng:");
		int n = scanner.nextInt();
		
		//B2: Kiểm tra n
		if (n <= 0) {
			System.out.println("Độ dài mảng không hợp lệ!");
			return;
		}
		double[] mang = new double[n];
		
		//B3: Nhập giá trị phần tử mảng
		for (int i = 0; i < n; i++) {
			System.out.print("mang[" + i + "] = ");
			mang[i] = scanner.nextDouble();
		}
		
		//B4: Tìm số lớn nhất, nhỏ nhất của mảng
		max(mang);
		min(mang);
	}
	
	public static void max (double[] mang) {
		double max = mang[0];
		for (int i = 1; i < mang.length; i++) {
			if (max < mang[i]) {
				max = mang[i];
			}
		}
		System.out.println("Số lớn nhất là: " + max);
	}
	
	public static void min (double[] mang) {
		double min = mang[0];
		for (int i = 1; i < mang.length; i++) {
			if (min > mang[i]) {
				min = mang[i];
			}
		}
		System.out.println("Số nhỏ nhất là: " + min);
	}
	
}

