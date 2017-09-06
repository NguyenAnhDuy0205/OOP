package QL;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<GiaoVien> list = new ArrayList<GiaoVien>();

		for (int i = 1; i < 5; i++) {
			list.add(new GiaoVienCD("Nguyen Anh Duy " + i, i + 20, "Giang Vien", 2000, i * 1.7f));
		}

		for (int i = 1; i < 5; i++) {
			list.add(new GiaoVienDH("Tran Khong Biet " + i, i + 20, "Tro Giang", 1000, i * 1.3f));
		}

		Scanner in = new Scanner(System.in);
		int luachon;
		QLGiaoVien ql = new QLGiaoVien();

		System.out.println("===========CHUONG TRINH QUAN LY GIAO VIEN===============");
		System.out.println("|| 1. Hien thi tat ca cac giao vien                    ||");
		System.out.println("|| 2. Hien thi tat ca cac giao vien Cao dang           ||");
		System.out.println("|| 3. Hien thi tat ca cac giao vien Dai hoc            ||");
		System.out.println("|| 4. Tim giao vien theo ho                            ||");
		System.out.println("|| 5. Sap xep giao vien theo luong giam dan            ||");
		System.out.println("|| 6. Thoat khoi chuong trinh                          ||");
		System.out.println("========================================================");

		do {
			System.out.print("Moi ban nhap chuc nang: ");
			luachon = in.nextInt();

			switch (luachon) {
			case 1:
				System.out.println("================= DANH SACH TAT CA CAC GIAO VIEN");
				ql.hienThi(list);
				break;
			case 2:
				System.out.println("================= DANH SACH TAT CA CAC GIAO VIEN CD");
				ql.hienThiGVtheoLoaiGV(list, true);
				break;
			case 3:
				System.out.println("================= DANH SACH TAT CA CAC GIAO VIEN DH");
				ql.hienThiGVtheoLoaiGV(list, false);
				break;
			case 4:
				System.out.print("---------------------Nhap ho ban muon tim:");
				in.nextLine();
				String Ho = in.nextLine();
				System.out.println("================= DANH SACH TAT CA CAC GIAO VIEN THEO HO" + Ho);
				ql.TimGiaoVientheoHo(list, Ho);
				break;
			case 5:
				System.out.println("================= DANH SACH TAT CA CAC GIAO VIEN DA DUOC SAP XEP");
				ql.SapXep(list);
			default:
				break;
			}

		} while (luachon != 6);
	}

}
