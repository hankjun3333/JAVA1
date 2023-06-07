package sec01.exam03;

public interface RemoteControl1 {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//중개역할을 하는건 구현클래스라고함 이제부터말햇다분명
}

