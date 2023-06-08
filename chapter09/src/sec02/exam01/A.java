package sec02.exam01;

public class A {
	A() { System.out.println("A 객체가 생성됨"); }
	
	/**인스턴스 멤버 클래스**/
	public class B {
		B() { System.out.println("B 객체가 생성됨"); }
		int field1;
		//static int field2;
		void method1() { }
		//static void method2() { }
	}
	
	/**정적 멤버 클래스**/
	static class C {
		C() { System.out.println("C 객체가 생성됨"); }
		int field1;
		static int field2;
		void method1() { }
		static void method2() { }
	}
	
	void method() {
		/**로컬 클래스**/
		class D {
			D() { System.out.println("D 객체가 생성됨"); }
			int field1;
			//static int field2;
			void method1() { }
			//static void method2() { }
		}
		D d = new D();
		d.field1 = 3;
		d.method1();		
	}
}

//자 클래스 B는 A안에잇는 중첩클래스 즉 인스턴스 멤바 클라스다 자 인스턴스 멤버 클래스라고하면
//객체를 생성해야 안에 접근이 가능한데 자 인스턴스멤버에ㅐ  static 이래버리면 접근 되버리니까
//말이안되지? ㅇㅇ
