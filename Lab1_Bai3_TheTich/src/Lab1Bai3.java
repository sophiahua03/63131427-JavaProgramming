import java.util.Scanner;

/**
 * 
 */
public class Lab1Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Khởi tạo Scanner
		Scanner scanner = new Scanner(System.in);
		
		// Nhập cạnh của khối lập phương
		System.out.print("Nhập cạnh của khối lập phương: ");
		double canh = scanner.nextDouble();
		
		// Tính thể tích khối lập phương
		double TheTich = Math.pow(canh, 3);
		
		// Xuất kết quả ra màn hình
		System.out.printf("Thể tích khối lập phương: %.2f\n", TheTich);
		
		//Đóng Scanner
		scanner.close();
		
	}

}
