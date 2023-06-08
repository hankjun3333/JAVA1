package sec01.exam01;


class Number {
	static int num = 0; // 스태틱 필드
	int num2 = 0; // 인스턴스 필드
}
public class StaticExample {

	public static void main(String[] args) {
		Number number1 = new Number();
		Number number2 = new Number();
		
		number1.num++; // 클래스 필드 num을 1증가시킴
		number1.num2++; // 인스턴스 필드 num을 1증가시킴
		System.out.println(number2.num); //두번째 number의 클래스의 필드 출력
		System.out.println(number2.num2); //두번째 number 인스턴스 필드 출력
		
		//static은 하나만 존재해서 Number클래스에서 공유하는거고 int num2는 인스턴스 필드다 ㅇㅋ?
		//number1 인스턴스필드 한개 잇고 number2 인스턴스 필드 하나 잇다 ㅇㅋ?
		//number1 num2++ 조져도 number2는 별개 인스턴스 필드 잇으니 0이찍히는거다 ㅇㅋ?
	}

}
