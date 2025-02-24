import java.util.Scanner;

public class DanhSach {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhập số lượng sinh viên: ");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		String[] ten = new String[n];
		double[] diem = new double[n];
		
		// Nhập danh sách sinh viên
		for (int i = 0; i < n; i++)
		{
			System.out.print("Nhập họ và tên sinh viên thứ " + (i + 1) + ": ");
			ten[i] = scanner.nextLine();
			System.out.print("Nhập điểm của sinh viên thứ: " + (i + 1) + ": ");
			diem[i] = scanner.nextDouble();
			scanner.nextLine();
		}
		
		// Sắp xếp danh sách theo điểm tăng dần
		for (int i = 0; i < n-1; i ++)
		{
			for (int j = i + 1; j < n; j++)
			{
				if (diem[i] > diem[j])
				{
					double tamDiem = diem[i];
					diem[i] = diem[j];
					diem[j] = tamDiem;
					
					String tamTen = ten[i];
					ten[i] = ten[j];
					ten[j] = tamTen;
				}
			}
		}
		
		// Xuất danh sách sinh viên
		System.out.println("Danh sách sinh viên: ");
		for (int i = 0; i < n; i ++)
		{
			String HocLuc;
			if (diem[i] < 5)
				HocLuc = "Yếu";
			else if (diem[i] < 6.5)
				HocLuc = "Trung bình";
			else if (diem[i] < 7.5)
				HocLuc = "Khá";
			else if (diem[i] < 9)
				HocLuc = "Giỏi";
			else
				HocLuc = "Xuất sắc";
			
			System.out.println("Họ và tên: " + ten[i]);
			System.out.println("Điểm: " + diem[i]);
			System.out.println("Học lực: " + HocLuc);
			System.out.println("-------------------------");
		}
		
		scanner.close(); 

	}

}
