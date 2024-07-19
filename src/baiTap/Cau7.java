package baiTap;

import java.util.Scanner;

/**
 * Câu 7
 */
public class Cau7 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//B1: Nhập số n
		System.out.println("Xin vui lòng nhập số nguyên dương n: ");
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
		
		//B4: In ra mảng
		System.out.println("Mảng đã nhập là: ");
		for (int i:mang) {
			System.out.print(i + "\t");
		}
	}
}
