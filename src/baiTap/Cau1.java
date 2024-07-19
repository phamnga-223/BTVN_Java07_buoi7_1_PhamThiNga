package baiTap;

import java.util.Scanner;

/**
 * Câu 1
 */
public class Cau1 {

	public static void main(String[] args) {
//		cau1();
//		
//		cau1_1();
//		
		cau1_2();
	}
	
	/**
	 * Câu 1
	 */
	public static void cau1 () {
		Scanner scanner = new Scanner(System.in);
		
		//B1: Người dùng nhập vào 1 số nguyên
		System.out.println("Xin vui lòng nhập 1 số nguyên:");
		int n = scanner.nextInt();
		
		//B2: Kiểm tra số nhập là âm hay dương
		if (n >= 0) {
			System.out.println("Đây là số nguyên dương");
		} else {
			System.out.println("Đây là số nguyên âm");
		}
	}

	/**
	 * Câu 1.1
	 */
	public static void cau1_1 () {
		Scanner scanner = new Scanner(System.in);
		
		//B1: Người dùng nhập vào 1 số nguyên
		System.out.println("Xin vui lòng nhập 1 số nguyên:");
		int n = scanner.nextInt();
				
		//B2: Kiểm tra số nhập là lẻ hay chẵn
		if (n % 2 != 0) {
			System.out.println("Số lẻ");
		} else {
			System.out.println("Số chẵn");
		}
	}
	
	/** 
	 * Câu 1.2
	 */
	public static void cau1_2 () {
		Scanner scanner = new Scanner(System.in);
		
		//B1: Người dùng nhập vào 1 số nguyên
		System.out.println("Xin vui lòng nhập 1 số nguyên:");
		int n = scanner.nextInt();
				
		//B2: Kiểm tra số có phải số nguyên tố hay ko?
		if (n < 2) {
			System.out.println("Không phải số nguyên tố");
		} else {
			if (n == 2) {
				System.out.println("Số nguyên tố");
				return;
			}
			
			for (int i = 2; i <= (n/2); i++) {
				//Tìm được số chia hết => In ra kết quả, kết thúc chương trình
				if (n % i == 0) {
					System.out.println("Không phải số nguyên tố");
					return;
				}
			}
			//Không tìm được số chia hết => In ra kết quả
			System.out.print("Số nguyên tố");
		}
	}
}

//6:37 pm 19/7/24 - 7:44 pm