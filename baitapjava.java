import java.util.Scanner;
public class NguoiDung {
private String TenNguoiDung;
private Double TuoiNguoiDung;
private String DiaChiEmail;
 
public NguoiDung(String TenNguoiDung, Double TuoiNguoiDung, String DiaChiEmail) {
	this.TenNguoiDung = TenNguoiDung;
	this.TuoiNguoiDung = TuoiNguoiDung;
	this.DiaChiEmail = DiaChiEmail;
}
public NguoiDung(String TenNguoiDung2, int i, String DiaChiEmail2) {
	// TODO Auto-generated constructor stub
}
public void NhapTT() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhap Ten Nguoi Dung : ");
	TenNguoiDung = scanner.nextLine();
	System.out.println("Nhap Tuoi Nguoi Dung : ");
	TuoiNguoiDung = scanner.nextDouble();
	System.out.println("Nhap Dia Chi Email");
	DiaChiEmail = scanner.nextLine();
}
public void HienThiTT() {
	System.out.println("Ten Nguoi Dung la : " + this.TenNguoiDung);
	System.out.println("TuoiNguoiDung la : "+ this.TuoiNguoiDung);
	System.out.println("Dia Chi Email cua nguoi dung : " +this.DiaChiEmail);
}
public boolean KiemTraTuoi() {
	return this.TuoiNguoiDung >=18;
}
}
