
public class Calculator {
	public int add(int a, int b) {
		int sum = a + b;
		if ((a > 9999) || (a < 0) && (b > 9999) || (b < 0) ) {
			sum = 0 ; 
		}
		return sum;
		
	}
	
	public int subtract(int a, int b) {
		int sum = a - b;
		if ((a > 9999) || (a < 0) && (b > 9999) || (b < 0) )  {
			sum = 0 ; 
		}
		return sum ;
	}
		
		
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		int sum = a - b;
		if ((a > 9999) || (a < 0) && (b > 9999) || (b < 0) ) {
			sum = 0 ; 
		}
		return sum ;
	}
	
	
	
	public int divide(int a, int b) {
		int sum = a/b;
		if (b==0) {
			throw new IllegalArgumentException();
		}
		if ((a > 9999) || (a < 0) && (b > 9999) || (b < 0) ) {
			sum = 0; 
		}
		
		return sum;
	
	}

}
