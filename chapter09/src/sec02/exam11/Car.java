package sec02.exam11;

public class Car {
	// Car.java
	public class Car {
		class Tire {}
		static class Engine {}
	}



	// NestedClassExample.java
	public class NestedClassExample {
		public static void main(String[] args) {
			Car myCar = new Car();
			Car.Tire tire =  myCar.new Tire( )  ;
			Car.Engine engine = new Car.Engine( )  ;
		}
	}
}
