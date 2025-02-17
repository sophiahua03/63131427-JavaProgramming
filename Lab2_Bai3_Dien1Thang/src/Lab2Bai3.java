import java.util.Scanner;

public class Lab2Bai3 {

	public static void main(String[] args) {
		// Khai báo Scanner
		Scanner scanner = new Scanner(System.in);
		
		int SoDien;
		
		// Nhập số điện sử dụng từ bàn phím
		do
		{
			System.out.print("Nhập số điện sử dụng trong tháng: ");
			SoDien = scanner.nextInt();
			
			if (SoDien < 0)
				System.out.println("Số điện không hợp lệ. Vui lòng nhập lại!");
			
		} while (SoDien < 0);
		
		// Tính số tiền điện một tháng
		int tien;
		if (SoDien <= 50)
			tien = SoDien * 1000;
		else
			tien = 50 * 1000 + (SoDien - 50) * 1200;
		
		// Kết quả
		System.out.println("Tiền điện phải trả: " + tien + " VND.");
		
		// Đóng Scanner
		scanner.close();

	}

}
