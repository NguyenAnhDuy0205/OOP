package QL;

public class GiaoVienDH extends GiaoVien {

	public GiaoVienDH(String ten, int tuoi, String chucVu, double luongCoBan, double heSoLuong) {
		super(ten, tuoi, chucVu, luongCoBan, heSoLuong);
	}

	@Override
	public double TinhLuong() {
		return this.getHeSoLuong() * this.getLuongCoBan() * 10;
	}

}
