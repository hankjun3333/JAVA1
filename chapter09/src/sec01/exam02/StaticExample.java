package sec01.exam02;


class Name {
	static void print() {
		System.out.println("내 이름은 홍길동 입니다.");
		
	}
	void print2() {
		System.out.println("내 이름은 이순신 입니다.");
	}
}
public class StaticExample {

	public static void main(String[] args) {
		Name.print(); // 인스턴스를 생성하지 않아도 호출이 가능 static void 
		
		Name name = new Name(); // 인스턴스 생성
		name.print2(); // 인스턴스를 생성하여야만 호출가능
	}

}
