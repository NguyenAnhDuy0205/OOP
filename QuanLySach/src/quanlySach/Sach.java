package quanlySach;

import java.util.Scanner;

public class Sach {

	private String tenSach;
	private String tenTacGia;
	private int namXB;
	
	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public int getNamXB() {
		return namXB;
	}

	public void setNamXB(int namXB) {
		this.namXB = namXB;
	}

	public Sach(String tenSach, String tenTacGia, int namXB) {
		
		this.tenSach = tenSach;
		this.tenTacGia = tenTacGia;
		this.namXB = namXB;
	}
	
	public Sach(){}
	
	public void Nhap(){
		Scanner in = new Scanner(System.in);
		
		System.out.printf("Nhap ten sach: ");
		tenSach = in.nextLine();
		System.out.printf("Nhap ten tac gia: ");
		tenTacGia = in.nextLine();
		while (true) {
			try {
				Scanner x = new Scanner(System.in);
				System.out.printf("Nhap nam xuat ban: ");
				namXB = x.nextInt();System.out.println();
				if(namXB<0){
					throw new Exception();
				}
				break;
			} catch (Exception e) {
				System.out.println("Ban can nhap so nguyen duong > 0");
			}
			
		}
		
		
	}
	
	public void Xuat(){
		System.out.printf("%-20s %-20s %-10d\n", tenSach, tenTacGia, namXB);
		
	}
	
	
	
}
