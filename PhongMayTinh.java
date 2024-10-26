package NguyenHuuTIen_23706591;

public class PhongMayTinh extends PhongHoc{
	private int soMayTinh;
	

	public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.soMayTinh = soMayTinh;
	}
	public PhongMayTinh() {
		super();
		this.soMayTinh= 0;
	}
	public int getSoMayTinh() {
		return soMayTinh;
	}



	public void setSoMayTinh(int soMayTinh) {
		this.soMayTinh = soMayTinh;
	}

	@Override
	public boolean getDatChuan() {
		return (duAnhSang() && getDienTich()/getSoMayTinh()<=1.5);
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("So may tinh: %s", getSoMayTinh());
	}
}
