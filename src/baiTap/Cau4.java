package baiTap;

import java.util.Scanner;

/**
 * Câu 4: Chương trình nhập vào n. Sau đó nhập vào n phần tử số nguyên
 * 		Cuối cùng, xuất ra giá trị trung bình của mảng này.
 */
public class Cau4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//B1: Nhập số n
		System.out.println("Xin vui lòng nhập n:");
		int n = scanner.nextInt();
		
		//B2: Kiểm tra n
		if (n <= 0) {
			System.out.println("Số n không hợp lệ!");
			return;
		}
		int[] mang = new int[n];
		
		//B3: Nhập giá trị phần tử mảng
		int tong = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("mang[" + i + "] = ");
			mang[i] = scanner.nextInt();
			tong += mang[i];
		}
		
		//B4: Tính trung bình
		double trungBinh = (double)tong / n;
		System.out.println("Kết quả: " + trungBinh);
	}
}
