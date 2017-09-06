package QL;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class QLGiaoVien {

	public void hienThi(ArrayList<GiaoVien> list) {

		for (GiaoVien giaoVien : list) {
			giaoVien.hienThi();
		}

	}

	public void hienThiGVtheoLoaiGV(ArrayList<GiaoVien> list, boolean isCD) {
		if (isCD) {
			for (GiaoVien giaoVien : list) {
				if (giaoVien instanceof GiaoVienCD)
					giaoVien.hienThi();
			}
		} else {
			for (GiaoVien giaoVien : list) {
				if (giaoVien instanceof GiaoVienDH)
					giaoVien.hienThi();
			}

		}
	}

	public void TimGiaoVientheoHo(ArrayList<GiaoVien> list, String ho) {
		boolean tonTai = false;
		for (GiaoVien giaoVien : list) {
			if (giaoVien.getTen().toLowerCase().startsWith(ho.toLowerCase())) {
				giaoVien.hienThi();
				tonTai = true;
			}
		}
		if (!tonTai) {
			System.out.println("Khong ton tai giao vien co ho " + ho);
		}
	}

	public void SapXep(ArrayList<GiaoVien> list) {
		Collections.sort(list, new Comparator<GiaoVien>() {

			@Override
			public int compare(GiaoVien o1, GiaoVien o2) {

				return o1.getLuong() > o2.getLuong() ? -1 : 1;
			}
		});
		
		System.out.println("Giao vien da duoc sap xep theo luong giam dan");
		this.hienThi(list);
	}

}
