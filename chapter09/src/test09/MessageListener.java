package test09;

public class MessageListener implements Button.OnClickListener{ //중첩클래스라 경로 버튼 밑에잇는 온클릭 리스너 . 붙여야됨

	@Override
	public void onClick() {
		System.out.println("메세지를 보냅니다.");
		
	}

}
