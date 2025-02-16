import java.util.ArrayList;

public class CTArrayList {

	public static void main(String[] args) {
		//Khai báo danh sach sản phẩm
		ArrayList<SanPhams> dsSanPham;
		
		// Xin mới
		dsSanPham = new ArrayList<SanPhams>();
		
		// Nhập 3 sản phẩm
		SanPhams sp1 = new SanPhams(0, "Kem", "Giải khát", null);
		SanPhams sp2 = new SanPhams(1, "Cơm", "Đồ ăn", null);
		SanPhams sp3 = new SanPhams(2, "Phở", "Đồ ăn", null);
		
		// Thêm vào ArrayList
		dsSanPham.add(sp1);
		dsSanPham.add(sp2);
		dsSanPham.add(sp3);
		
		// for (SanPham x: dsSanPham)
		//		System.out.println(x.toString());
		
		for (int i = 0; i < dsSanPham.size(); i++)
		{
			SanPhams sp = dsSanPham.get(i);
			System.out.println(sp.toString());
		}
		
	}

}
