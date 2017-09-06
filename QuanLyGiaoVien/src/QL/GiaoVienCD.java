package QL;

public class GiaoVienCD extends GiaoVien {

	public GiaoVienCD(String ten, int tuoi, String chucVu, double luongCoBan, double heSoLuong) {
		super(ten, tuoi, chucVu, luongCoBan, heSoLuong);
	}

	@Override
	public double TinhLuong() {
		return this.getHeSoLuong()* this.getLuongCoBan() * 3;
	}

}
