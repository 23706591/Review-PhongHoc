package NguyenHuuTIen_23706591;

import java.util.ArrayList;
import java.util.List;

public class ListPhongHoc {
	private List<PhongHoc> ds;
	public ListPhongHoc() {
		ds = new ArrayList<PhongHoc>();
	}
	public boolean themPhong(PhongHoc p) {
		if(ds.contains(p))
			return false;
		ds.add(p);
		return true;
	}
	public PhongHoc timPhong(String maPhong) {
		for (PhongHoc p : ds) {
			if(p.getMaPhong().equalsIgnoreCase(maPhong))
				return p;
		}
		return null;
	}
	
	public List<PhongHoc> danhSachDC(){
		List<PhongHoc> dsDC = new ArrayList<PhongHoc>();
		for (PhongHoc p : ds) {
			if(p.getDatChuan())
				dsDC.add(p);
		}
		return dsDC;
	}
	
	public void sapXepTheoDayNha() {
		ds.sort((p1,p2)-> p1.getDayNha().compareToIgnoreCase(p2.getDayNha()));
	}
	public void sapXepTheoDienTich() {
		ds.sort((p1,p2)-> Double.compare(p2.getDienTich(), p1.getDienTich()));
	}
	public void sapXepTheoSoBongDen() {
		ds.sort((p1,p2)-> Integer.compare(p1.getSoBongDen(), p2.getSoBongDen()));
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (PhongHoc p : ds) {
			sb.append(p.toString()).append("\n");
		}
		return sb.toString();
	}
}
