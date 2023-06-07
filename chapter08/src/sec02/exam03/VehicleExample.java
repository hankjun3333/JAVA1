package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();  
		//vehicle.run();은 되는데
		//vehicle.checkFare();은 안됨 인터페이스로 형변환되서
		
		vehicle.run();
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
		
		
	}

}
