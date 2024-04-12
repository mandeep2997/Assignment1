package twoNumbers;

public class TwoNumbers {
	int num1 = 25;
	int num2 = 30;
	int result = 0;

	// this method add two numbers
	

	void addTwoNumber() {
		
		int c = 10;
		result = num1+num2 - c;
		System.out.println("Result of add numbers "+   result);

		System.out.println(c);
	}

	void subtractTwoNumber () 
	{
		result =num1-num2;
		System.out.println("Result of subtract two numbers:" + result  );
		
	}

	void multiplyTwoNumber() {
		result = num1 * num2;
		System.out.println("Result of multiply numbers" + result);

	}

}
