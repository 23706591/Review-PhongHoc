package NguyenHuuTIen_23706591;

import java.util.List;

public class TestPhongHoc {
public static void main(String[] args) {
	ListPhongHoc p = new ListPhongHoc();
	p.themPhong(new PhongLyThuyet("B4.2", "Day nha B", 100, 30, true));
	p.themPhong(new PhongMayTinh("H5.2.2", "Day nha H", 100, 31, 50));
	p.themPhong(new PhongThiNghiem("V3.4", "Day nha V", 110, 32, "Toan", 55, true));
	p.themPhong(new PhongThiNghiem("B5.6", "Day nha B", 90, 25, "Hoa Hoc", 50, false));
	
	System.out.println("Danh sach phong hoc:");
	System.out.println(p);
	
	String mp = "H5.2.2";
	System.out.println("Phong hoc voi ma: " + mp);
	System.out.println(p.timPhong(mp));
	
	List<PhongHoc> pDC = p.danhSachDC();
	System.out.println("Danh sach phong dat chuan: ");
	for (PhongHoc p1 : pDC) {
		System.out.println(p1);
	}
	
	p.sapXepTheoDayNha();
	System.out.println("Danh sach phong hoc xep theo day nha:");
	System.out.println(p);
	
	p.sapXepTheoDienTich();
	System.out.println("Danh sach phong hoc xep theo dien tich:");
	System.out.println(p);
	
	p.sapXepTheoSoBongDen();
	System.out.println("Danh sach phong hoc xep theo so bong den:");
	System.out.println(p);
}
}
