
public class Vehicle implements VehicleInterface{
	private int vno;
	private String vtype;
	
	public Vehicle(int vno, String vtype) {
		super();
		this.vno = vno;
		this.vtype = vtype;
	}
	
	public int getVno() {
		return vno;
	}
	public void setVno(int vno) {
		this.vno = vno;
	}
	public String getVtype() {
		return vtype;
	}
	public void setVtype(String vtype) {
		this.vtype = vtype;
	}
	
	@Override
	public void showMsg() {
		System.out.println("WElcome...");
	}

	@Override
	public String toString() {
		return "Vehicle [vno=" + vno + ", vtype=" + vtype + "]";
	}
}
