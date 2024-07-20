package baiTap;

import java.util.Scanner;

/**
 * Câu 3: Chương trình nhập vào số nguyên dương n.
 * 		Tính tổng tất cả số chẵn trong khoảng từ 0-n
 */
public class Cau3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//B1: Nhập số n
		System.out.println("Xin vui lòng nhập vào số nguyên dương n");
		int n = scanner.nextInt();
		
		//B2: Kiểm tra số n
		if (n < 0) {
			System.out.println("Số nhập vào không hợp lệ!");
			return;
		}
		
		//B3: Tính tổng tất cả số chẵn trong khoảng từ 0-n
		int tong = 0;
		for (int i = 0; i <= n; i += 2) {
			tong += i;
		}
		System.out.println("Tổng tất cả số chẵn từ 0-n là: " + tong);
	}
}
