
public class SanPhams {
	//Định nghĩa các thuộc tính
		int maSP;
		String tenSP;
		String loaiSP;
		String anhSP;
		
		public SanPhams() {
			super();
		}

		public SanPhams(int maSP, String tenSP, String loaiSP, String anhSP) {
			super();
			this.maSP = maSP;
			this.tenSP = tenSP;
			this.loaiSP = loaiSP;
			this.anhSP = anhSP;
		}



		public int getMaSP() {
			return maSP;
		}

		public void setMaSP(int maSP) {
			this.maSP = maSP;
		}

		public String getTenSP() {
			return tenSP;
		}

		public void setTenSP(String tenSP) {
			this.tenSP = tenSP;
		}

		public String getLoaiSP() {
			return loaiSP;
		}

		public void setLoaiSP(String loaiSP) {
			this.loaiSP = loaiSP;
		}

		public String getAnhSP() {
			return anhSP;
		}

		public void setAnhSP(String anhSP) {
			this.anhSP = anhSP;
		}

		
		public String toString() {
			return "[Mã SP=" + maSP + ", Tên SP=" + tenSP + ", Loại SP=" + loaiSP + "]";
		}
}
