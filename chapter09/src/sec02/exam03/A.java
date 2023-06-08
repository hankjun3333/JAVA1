package sec02.exam03;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	//멤버 클래스가 객체 생성없이 사용할수 있는 정적으로 선언되면 
	//객체를 생성해서 사용해야 하는 바깥 클래스의 필드와 메소드는 사용할수없다
	//또는, 안쪽 정적클래스 안에 메스드 1개 에서는 바깥 클래스의 
	//인스턴스 필드와 메소드 여러개 안에서 값을 바꾸는것이 가능하려면
	//서로 짝이 맞아야 하는데
	
	class B{
		void method() {
			field1 =10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C {
		void method() {
			//field1 =10;
			//method1();
			
			field2 = 30;
			method2();
		}
	}
}
