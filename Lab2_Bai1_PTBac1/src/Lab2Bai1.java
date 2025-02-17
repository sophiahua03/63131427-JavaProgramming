import java.util.Scanner;

public class Lab2Bai1 {
	
	
	public static void main(String[] args) {
		// Khai báo Scanner
		Scanner scanner = new Scanner(System.in);
		
		// Nhập hệ số a, b từ bàn phím
		System.out.print("Nhập hệ số a: ");
		double a = scanner.nextDouble();
		
		System.out.print("Nhập hệ số b: ");
		double b = scanner.nextDouble();
		
		// Giải phương trình bậc nhất ax + b = 0
		if (a == 0)
			if (b == 0)
			{
				System.out.println("Phương trình có vô số nghiệm.");
			} 
			else
			{
				System.out.println("Phương trình vô nghiệm.");
			}
		else
		{
			double x = -b / a;
			System.out.println("Nghiệm của phương trình là x = " + x);
		}
		
		// Đóng Scanner
		scanner.close();
	}

}
