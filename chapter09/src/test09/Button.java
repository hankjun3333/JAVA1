package test09;

public class Button {
	OnClickListener listener; //인터페이스 타입 필드(필드명 listener)를 선언
	public void setOnClickListener(OnClickListener listener) { // 인터페이스는 객체생성 x 
		this.listener = listener; 
	}
	//실제 버튼 클릭했을때 실행하는 내용을 작성하지 않음
	void touch() {
		listener.onClick(); // 구현클래스 객체의 onClick() 메소드를 호출만해줌
	}
	
	//listener초기화할려면 겟셋 객체생성할수 없으니
	
	
	//중첩 인터페이스 : 버튼을 클릭했을때 실제로 실행할 내용을 담고 있는 구현객체를 얻기 위해서
	//객체 선언 없이 사용가능하니까 정적 인터페이스 만듦 객체없이 사용가능
	static interface OnClickListener{
		void onClick(); //인터페이스니까 추상메소드 실행블럭 없음
		
	}
}
