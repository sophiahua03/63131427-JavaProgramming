
public class TienDien {
	private InputData input = new InputData();
	public void TinhTienDien()
	{
		double soDien = input.inputData("\n Nhập số diện đã sử dụng: ");
		double tien;
		
		if (soDien < 0)
		{
			System.out.println("Số Điện không hợp lệ");
			return;
		}
		
		if (soDien < 50)
			tien = soDien * 1000;
		else
			tien = soDien * 1000 + (soDien - 50) * 1200;
		
		System.out.println("Tiền điện phải trả: "+ tien + "VND");
	}
}
