package baiTap;

import java.util.Scanner;

/**
 * Câu 6
 */
public class Cau6 {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//B1: Nhập chiều rộng hình vuông
		System.out.println("Xin vui lòng nhập chiều rộng hình vuông: ");
		double n = scanner.nextDouble();
		
		//B2: Kiểm tra n
		if (n <= 0) {
			System.out.println("Chiều rộng hình vuông không hợp lệ!");
			return;
		}
		
		//B3: Tính diện tích hình vuông
		dienTich(n);
		
		//B4: Tính chu vi hình vuông
		chuVi(n);
	}
	
	public static void dienTich (double n) {
		System.out.println("Diện tích hình vuông là: " + (n * n));
	}
	
	public static void chuVi (double n) {
		System.out.println("Chu vi hình vuông là: " + (4 * n));
	}
}
