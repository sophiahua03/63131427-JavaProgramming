
import java.util.Scanner;

public class Lab2Bai2 {

	public static void main(String[] args) {
		// Khai báo scanner
		Scanner scanner = new Scanner(System.in);
		
		// Nhập hệ số a, b, c từ bàn phím
		System.out.print("Nhập hệ số a: ");
		double a = scanner.nextDouble();
		
		System.out.print("Nhập hệ số b: ");
		double b = scanner.nextDouble();
		
		System.out.print("Nhập hệ số c: ");
		double c = scanner.nextDouble();
		
		// Phương trình bậc hai
		if (a == 0) // a = 0 thì phương trình trở thành bx + c = 0
		{
			if (b == 0)
			{
				if (c == 0)
					System.out.println("Phương trình có vô số nghiệm.");
				else
					System.out.println("Phương trình vô nghiệm.");
			}
			else
			{
				double x = -c / b;
				System.out.println("Nghiệm của phương trình là: " + x);
			}
		}
		else
		{
			// Tính delta
			double Delta = Math.pow(b, 2) - 4 * a * c;
			
			System.out.println("Delta = " + Delta);
			
			if (Delta < 0)
				System.out.println("Phương trình vô nghiệm");
			else if (Delta == 0)
			{
				double x = -b / (2 * a);
				System.out.println("Phương trình có nghiệm kép x = " + x);
			}
			else
			{
				double x1 = (-b + Math.sqrt(Delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(Delta)) / (2 * a);
				
				System.out.println("Phương trình có hai nghiệm kép là: ");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
				
		}
		
		// Đóng Scanner
		scanner.close();

	}

}
