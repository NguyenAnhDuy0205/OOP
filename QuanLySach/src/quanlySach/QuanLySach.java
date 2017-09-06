package quanlySach;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {

	public static void main(String[] args) {
		int luachon;
		ArrayList<Sach> list = new ArrayList<Sach>();
		int n;
		int Array[] = null;
		System.out.println("-------------------------------------------");
		System.out.println("|						|");
		System.out.println("| 1. Nhap vao so quyen sach.");
		System.out.println("| 2. Hien thi toan bo quyen sach");
		System.out.println("| 3. Liet ke sach xuat ban truoc nam n");
		System.out.println("| 4. Thoat chuong trinh");
		System.out.println("|						|");
		System.out.println("-------------------------------------------");

		do {
			try {
				Scanner in = new Scanner(System.in);
				System.out.println("Moi ban nhap so lua chon");
				luachon = in.nextInt();
			} catch (Exception e) {
				System.out.println("Moi ban nhap so chinh xac theo Menu");
				luachon = 0;
			}
			switch (luachon) {
			case 1:
				while (true) {
					try {
						System.out.println("So luong sach: ");
						Scanner in = new Scanner(System.in);
						n = in.nextInt();
						if (n < 0) {
							throw new Exception();
						}
						break;
					} catch (Exception e) {
						System.out.println("Moi ban nhap dung so!!!");
						n = 1;
					}
				}
				Array = new int[n];
				for (int i = 0; i < Array.length; i++) {
					System.out.printf("--------------Moi ban nhap thong tin sach thu %d-------------\n", i + 1);
					Sach s = new Sach();
					s.Nhap();
					list.add(s);
				}
				break;

			case 2:
				System.out.println("------------------------------Thong tin sach---------------------------------");
				System.out.printf("%-20s %-20s %-10s\n", "Ten sach", "Ten Tac Gia", "Nam Xuat Ban");
				for (int i = 0; i < list.size(); i++) {
					list.get(i).Xuat();

				}
				break;

			case 3:
				int dem = 0;
				while (true) {
					try {
						System.out.println("Nhap vao nam can so sanh:");
						Scanner a = new Scanner(System.in);
						n = a.nextInt();
						if (n < 0) {
							throw new Exception();
						}
						break;
					} catch (Exception e) {
						System.out.println("Moi ban nhap lai so chinh xac");
						n = 1;
					}
				}

				System.out.println("------------Thong tin nhung quyen sach co nam xuat ban sau nam " + n
						+ "---------------------------------");
				System.out.printf("%-20s %-20s %-10s\n", "Ten sach", "Ten Tac Gia", "Nam Xuat Ban");
				for (int i = 0; i < list.size(); i++) {
					if (n > list.get(i).getNamXB()) {
						list.get(i).Xuat();
						dem++;
					}
				}
				if (dem == 0) {
					System.out.println("Khong co quyen sach nao xuat ban truoc nam " + n);
				}
				break;
			}
		} while (luachon != 4);

	}

}
