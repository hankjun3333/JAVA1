package sec01.exam04;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl1 rc; //인터페이스는 생성자 못만들어서 선언만함
		rc = new Television(); //인터페이스 타입에다 집어넣음
		rc.turnOff();
		rc.setVolume(5);
		rc.turnOn();
		
		rc = new Audio();

	}

}
