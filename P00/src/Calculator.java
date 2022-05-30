
public class Calculator {
	public int add(int a, int b) {
		int sum = a + b;
		if ( sum > 9999 || sum < 0) {
			sum = 0 ; 
		}
		return sum;
		
	}
	
	public int subtract(int a, int b) {
		int sum = a - b;
		if ( sum > 9999 || sum < 0) {
			sum = 0 ; 
		}
		return sum ;
	}
		
		
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		int sum = a - b;
		if ( sum > 9999 || sum < 0) {
			sum = 0 ; 
		}
		return sum ;
	}
	
	
	
	public int divide(int a, int b) {
		if (b==0) {
			throw new IllegalArgumentException();
		}
		return a / b;
	
	}

}
