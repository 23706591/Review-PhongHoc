package NguyenHuuTIen_23706591;

public class PhongLyThuyet extends PhongHoc{
	private boolean coMayChieu;
	
	
	public PhongLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean coMayChieu) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.coMayChieu = coMayChieu;
	}


	public PhongLyThuyet() {
		super();
		this.coMayChieu = false;
	}

	

	public boolean isMayChieu() {
		return coMayChieu;
	}


	public void setMayChieu(boolean coMayChieu) {
		this.coMayChieu = coMayChieu;
	}


	@Override
	public boolean getDatChuan() {
		return(duAnhSang() && coMayChieu);
	}
	@Override
	public String toString() {
		String mayChieu = coMayChieu ? "Co may chieu" : "Khong co may chieu";
		return super.toString() + String.format("%s",mayChieu);
	}

}
