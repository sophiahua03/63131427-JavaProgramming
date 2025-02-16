/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab01_Bai01_DuongTrungBinh {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Khởi tạo Scanner để đọc dữ liệu
		Scanner scanner = new Scanner(System.in);
		//Nhập họ và tên
		System.out.print("Họ và tên: ");
		String hoTen = scanner.nextLine();
		//Nhập điểm trung bình
		System.out.print("Điểm TB: ");
		double diemTB = scanner.nextDouble();
		//Xuất kết quả
		System.out.printf("%s: %.2f điểm\n", hoTen, diemTB);
		//Đóng Scanner
		scanner.close();
		
		
	}

}
