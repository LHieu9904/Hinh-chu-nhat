package LeNgocHieu_22003005;

import java.util.Scanner;

public class HinhChuNhat {
	private double chieudai;
	private double chieurong;
	public double getChieudai() {
		return chieudai;
	}
	public void setChieudai(double d) {
		if (d>0) {
			this.chieudai = d;
		} else {
			System.out.println("Loi d");
			
		}
		
	}
	public double getChieurong() {
		return chieurong;
	}
	public void setChieurong(double r) {
		if (r<=0) {
			System.out.println("Loi r");
		} else {
			this.chieurong = r;

		}
		
	}
	public HinhChuNhat() {}
	public HinhChuNhat(double d, double r) {
		if (d>0) {
			this.chieudai = d;
		} else {
			System.out.println("Loi d");
			
		}
		if (r<=0) {
			System.out.println("Loi r");
		} else {
			this.chieurong = r;

		}
	}
	public double getChuVi() {
		return (getChieudai()+getChieurong())*2;
	}
	public double getDienTich() {
		return (getChieudai()*getChieurong());
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public static void main(String[] args) {
		HinhChuNhat h1= new HinhChuNhat();
		h1.setChieudai(5);
		h1.setChieurong(2);
		System.out.println("Chieu dai la: "+h1.getChieudai());
		System.out.println("Chieu rong la: "+h1.getChieurong());
		System.out.println("Dien tich la: "+h1.getDienTich());
		System.out.println("Chu vi la: "+h1.getChuVi());
		HinhChuNhat h2 = new HinhChuNhat(5,3);
		System.out.println("Chieu dai la: "+h2.getChieudai());
		System.out.println("Chieu rong la: "+h2.getChieurong());
		System.out.println("Dien tich la: "+h2.getDienTich());
		System.out.println("Chu vi la: "+h2.getChuVi());
		//Nhap tay
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap tu ban phim");
		System.out.println("NHap chieu dai: ");
		double d = sc.nextDouble();
		h1.setChieudai(d);
		System.out.println("NHap chieu dai: ");
		double r = sc.nextDouble();
		h1.setChieurong(r);
		System.out.println("Chieu dai la: "+h1.getChieudai());
		System.out.println("Chieu rong la: "+h1.getChieurong());
		System.out.println("Dien tich la: "+h1.getDienTich());
		System.out.println("Chu vi la: "+h1.getChuVi());
		
	}
	

}
