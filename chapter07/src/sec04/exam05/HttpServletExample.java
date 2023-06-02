package sec04.exam05;

public class HttpServletExample {

	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownLoadServlet());
		//var HttpServlet servlet = new LoginServlet()
		//필드 다형성 보다 많이씀 매개변수 다형성이
		//매개변수의 다형성 이고 추상메소드는 반드시 자식클래스타입에서 오버라이딩 재정의를해야함ㅋ
		
	}
	public static void method(HttpServlet servlet) {
		servlet.service();
	}

}
