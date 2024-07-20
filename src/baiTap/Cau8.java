package baiTap;

import java.util.Scanner;

/**
 * Câu 8: Nhập mảng có n phần tử các số nguyên. In ra các phần tử là số chẵn.
 */
public class Cau8 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// B1: Nhập số n
		System.out.println("Xin vui lòng nhập số n: ");
		int n = scanner.nextInt();
		
		//B2: Kiểm tra số n
		if (n < 0) {
			System.out.println("Số n không hợp lệ!");
			return;
		}
		if (n == 0) {
			System.out.println("Mảng rỗng!");
			return;
		}
		int[] mang = new int[n];
		
		//B3: Nhập các phần tử
		System.out.println("Xin vui lòng nhập các phần tử: ");
		for (int i = 0; i < n; i++) {
			System.out.print("mang[" + i + "] = ");
			mang[i] = scanner.nextInt();
		}
		
		//B4: In ra các phần tử là số chẵn
		System.out.println("Các phần tử là số chẵn là: ");
		for (int i:mang) {
			if (i % 2 == 0) {
				System.out.print(i + "\t");
			}
		}
	}
}
