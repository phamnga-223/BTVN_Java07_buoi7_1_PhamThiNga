package baiTap;

import java.util.Scanner;

/**
 * Câu 2
 */
public class Cau2 {

	static String[] chu = {"Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín", "Mười"};
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//B1: Nhập số n
		System.out.println("Xin vui lòng nhập vào số nguyên từ 1 đến 10");
		int n = scanner.nextInt();
		
		//B2: Kiểm tra n
		if (n < 1 || n > 10) {
			System.out.println("Số nhập vào không nằm trong khoảng từ 1 đến 10!");
			return;
		}
		
		//B3: In ra dạng chữ
		for (int i = 0; i < n; i++) {
			System.out.println(i+1 + " -> " + chu[i]);
		}
	}
}
