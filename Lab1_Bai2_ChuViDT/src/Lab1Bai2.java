/**
 * 
 */

import java.util.Scanner;

/**
 * 
 */
public class Lab1Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Khởi tạo Scanner
		Scanner scanner = new Scanner(System.in);
		// Nhập chiều dài và chiều rộng của hình chữ nhật
		System.out.print("Nhập chiều dài: ");
		double chieuDai = scanner.nextDouble();
		
		System.out.print("Nhập chiều rộng: ");
		double chieuRong = scanner.nextDouble();
		
		// Tính chu vi, diện tích và cạnh nhỏ nhất 
		double ChuVi = (chieuDai + chieuRong) * 2;
		double DienTich = chieuDai * chieuRong;
		double CanhNhoNhat = Math.min(chieuDai, chieuRong);
		
		//Xuất kết quả
		System.out.printf("Chu vi: %.2f\n", ChuVi);
		System.out.printf("Diện tích: %.2f\n", DienTich);
		System.out.printf("Cạnh nhỏ nhất: %.2f\n", CanhNhoNhat);
		
		//Đóng Scanner
		scanner.close();

	}

}
