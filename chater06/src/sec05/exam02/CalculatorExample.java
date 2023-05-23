package sec05.exam02;

public class CalculatorExample {

	public static void main(String[] args) {
		
	   double result1 = 10 * 10 * Calculator.pi;
	   int result2 = Calculator.plus(10,5);
	   int result3 = Calculator.minus(10,5);
	   
	   //static은 생성자라 상관이 없어서 클래스.메소드 식으로 표현
	   //static안붙으면 인스턴스 변수명.클래스 방식으로 표현
	   	   
	   
	   System.out.println("result1 : " + result1);
	   System.out.println("result2 : " + result2);
	   System.out.println("result3 : " + result3);
	}

}
