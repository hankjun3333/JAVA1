package sec01.exam05;

public class Television implements RemoteControl1{
	//필드 private 쓰면 get set 사용함
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl1.MAX_VOLUME) {
			this.volume = RemoteControl1.MAX_VOLUME;
			
		} else if (volume<RemoteControl1.MIN_VOLUME) {
			this.volume = RemoteControl1.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 tv 볼륨: " + this.volume);
		
	}
	@Override
	public void search(String url) {
		System.out.println(url +"을 감사합니다. ");
	}
	
}











