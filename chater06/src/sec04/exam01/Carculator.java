package sec04.exam01;

public class Carculator {
	//메소드만 잔뜩
	void powerOn() {
		System.out.println("전원을 킵니다.");
		
	}
	int plus(int x , int y) {
		int result = x + y;
		return result;
	}
	
	double divide(double x, double y) {
		double result = (double)x / (double)y;
		return result;
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
