package calculator;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		char operator = '-';
		int sum = 0;
		
		if(operator == '+') {
			sum = num1 + num2;
			System.out.println(sum);
		}
		
		else if(operator == '-') {
			sum = num1 - num2 ;
			System.out.println(sum);
		}
		
		else if(operator == '*') {
			sum = num1 * num2;
			System.out.println(sum);
		}
		
		else  if(operator == '/') {
			sum = num1 / num2;
			System.out.println(sum);
		}

	}

}
