import java.util.Scanner;

/**
 * 
 */
public class Lab1Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Khởi tạo Scanner
		Scanner scanner = new Scanner(System.in);
		
		// Nhập các hệ số của phương trình bậc 2
		System.out.print("Nhập hệ số a: ");
		double a = scanner.nextDouble();
		
		System.out.print("Nhập hệ số b: ");
		double b = scanner.nextDouble();
		
		System.out.print("Nhập hệ số c: ");
		double c = scanner.nextDouble();
		
		//Tính delta và căn delta
		double Delta = Math.pow(b,2) - 4 * a * c;
		double canDelta = Math.sqrt(Delta);
		
		//Xuất kết quả ra màn hình
		System.out.printf("Delta: %.2f\n", Delta);
		System.out.printf("Căn Delta: %.2f\n", canDelta);
		
		//Đóng Scanner 
		scanner.close();
		
	}

}
