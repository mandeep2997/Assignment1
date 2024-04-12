package comparisonof;

public class comparisonclass {
	
	int a=15;
	int b=10;
	boolean result = false;
	
	public void isAGreaterThanB() {
		result = a>b;
		System.out.println("Is A Greater Then B: " +  result);
	}
	
	public void isAGreaterThanorEqualtoB() {
		result = a >=b;
		System.out.println("Is A Greater Then or Equal To B: " +  result);
	}
     public void compareTwoNumbers() {
    	 result =a==b;
    	 System.out.println("Is A equal to B: " +  result);
		
		
		
		
	}
}
