package DuongTheVinh;

import java.time.LocalDate;

class khachhangVN  extends khachhang{
	 private String doituong;
	 private double dinhmuc;
	public khachhangVN(String maKH, String hoTen, LocalDate ngayLapHoaDon, double soKW, double donGia, String doituong,
 double dinhmuc) {
		super(maKH, hoTen, ngayLapHoaDon, soKW, donGia);
		this.dinhmuc =dinhmuc;
		this.doituong = doituong;
	}
	public String getdoituong() {
		return doituong;
	}
	@Override
	public double thanhTien() {
		
		return soKW <= dinhmuc
				? soKW* donGia
				: dinhmuc * donGia + (soKW- dinhmuc) * donGia * 2.5;
	}
	
	 

}
