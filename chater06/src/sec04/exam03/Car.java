package sec04.exam03;

public class Car {
	//필드 
	
	int gas;
	
	//생성자
	public Car(int gas) {
		this.gas = gas;
	}
	public Car() {
	
	}
	//메소드
	void setga(int gas) {
	
	this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
		
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				return; //여기서 return은 끝낸다는 소리
			}
		}
	}
	public void setgas(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
