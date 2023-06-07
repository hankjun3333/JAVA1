package sec02.exam02;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		//메소드 매개변수의 자동형변환 동생아님ㅋ
		
		
	}

}
