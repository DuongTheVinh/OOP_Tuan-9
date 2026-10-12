package DuongTheVinh;

import java.time.LocalDate;

class khachnuocngoai extends khachhang {
	 private String quoctich;

	public khachnuocngoai(String maKH, String hoTen, LocalDate ngayLapHoaDon, double soKW, double donGia , String quoctich) {
		super(maKH, hoTen, ngayLapHoaDon, soKW, donGia);
		this.quoctich= quoctich;
	}
	public String getquoctich() {
		return quoctich;
	}
	public double thanhTien() {
		return soKW * donGia;
	}
	
	 

}
