//interface
public class Main_Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1=new Vehicle(1,"AAA");
		
		v1.setVno(1234);
		v1.setVtype("car");
		System.out.println(v1.toString());
		v1.showMsg();
	}

}
