package sec04.exam02;

public class Computer {
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
		
		
	}
	//개수를 정하지않앗을때 문법
	int sum2(int...values) {
		int sum =0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
			
		}
		return sum;
	}
	
}
