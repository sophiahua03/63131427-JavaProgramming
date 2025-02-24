import java.util.Scanner;

public class ktSNT {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập một số nguyên: ");
		
		int n = scanner.nextInt();
		scanner.close();
		
		if (n <= 1)
		{
			System.out.println(n + " không phải là số nguyên tố");
			return;
		}
		
		boolean ok = true;
		for (int i = 2; i <= Math.sqrt(n); i++)
		{
			if (n % i == 0)
			{
				ok = false;
				break;
			}
		}
		
		if (ok)
			System.out.println(n + " là số nguyên tố");
		else
			System.out.println(n + " không phải là số nguyên tố");

	}

}
