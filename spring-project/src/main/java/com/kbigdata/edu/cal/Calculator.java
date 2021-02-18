package com.kbigdata.edu.cal;

public class Calculator {
//	1. add(+) 계산 후 출력(프린트)
	public void addition(int firstNum, int secondNum) {
		System.out.println("Addition");
		int result = firstNum+secondNum;
		System.out.println( firstNum
						  + " + "
						  + secondNum 
						  + " = "
						  + result);
	}
	
//	2. sub(-)
	public void sub(int firstNum, int secondNum) {
		System.out.println("Subtraction");
		int result = firstNum - secondNum;
		System.out.println( firstNum 
						  + " - "
						  + secondNum
						  + " = "
						  + result);
	}
	
//	3. mul(*)
	public void mul(int firstNum, int secondNum) {
		System.out.println("Multiplication");
		int result = firstNum * secondNum;
		System.out.println( firstNum 
						  + " * "
						  + secondNum
						  + " = "
						  + result);
	}
	
//	4. div(/)
	public void div(int firstNum, int secondNum) {
		System.out.println("Division");
		int result = firstNum / secondNum;
		System.out.println( firstNum 
						  + " / "
						  + secondNum
						  + " = "
						  + result);
	}
	
}
