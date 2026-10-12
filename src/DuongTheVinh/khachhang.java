package DuongTheVinh;

import java.time.LocalDate;

abstract class khachhang {
	protected String maKH;
	protected String hoTen;
	protected LocalDate ngayLapHoaDon;
	protected double soKW;
	protected double donGia;
	public khachhang(String maKH, String hoTen, LocalDate ngayLapHoaDon, double soKW, double donGia) {
		
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.ngayLapHoaDon = ngayLapHoaDon;
		this.soKW = soKW;
		this.donGia = donGia;
	}
	public abstract double thanhTien();
	public LocalDate getngayLapHoaDon(){
		return ngayLapHoaDon;
	}
	public String getmaKH() {
		return maKH;
	}
	public String gethoTen() {
		return hoTen;
	}
@Override
public String toString() {
	
	return String.format("%s | %s|ngay: %s | Thanh tien :%-1.0f",
			maKH,
			hoTen,
			ngayLapHoaDon,
			thanhTien()
			);
}

	
		
	
		
	
}
