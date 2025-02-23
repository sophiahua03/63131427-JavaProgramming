
import java.util.Scanner;
class Menu {

	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		GiaiPTBac1 ptb1 = new GiaiPTBac1();
		GiaiPTBac2 ptb2 = new GiaiPTBac2();
		TienDien tienD = new TienDien();
		
		int chon;
		do
		{
			System.out.println("\n+-------------------------------------------+");
			System.out.println("| 1. Giải phương trình bậc nhất				  |");
			System.out.println("| 2. Giải phương trình bậc hai				  |");
			System.out.println("| 3. Tính tiền điện							  |");
			System.out.println("| 4. Kết thúc								  |");
			System.out.println("\n+-------------------------------------------+");
			System.out.print("Chọn chức năng: ");
			chon = scanner.nextInt();
			
			switch (chon)
			{
				case 1: ptb1.PTBac1();	break;
				case 2: ptb2.PTBac2();	break;
				case 3: tienD.TinhTienDien(); break;
				case 4:
					System.out.println("Kết thúc chương trình");
					break;
				default:
					System.out.println("Lựa chọn không hợp lệ");
			}
		} while (chon != 4);

	}
	
	public static void main(String[] args) {
		menu();
	
	}

}
