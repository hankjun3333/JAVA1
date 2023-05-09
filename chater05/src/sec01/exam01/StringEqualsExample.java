package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		String strvar3 = "123";
		String strvar4 = "123";
		
		if(strVar3 == strVar4) {
			System.out.println(" strVAr3과 strVar4는 참조가 같음");	
		} else {
			 System.out.println("strVar1과 strVar2는 참조가 다름");
			
		}
		
		if(strVar3.equls(strVar4)) {
				System.out.println("strVar과 strVar4는 문자열이 같음");
			
		}
			//이해하도록하기
		
		
		
		

	}

}
