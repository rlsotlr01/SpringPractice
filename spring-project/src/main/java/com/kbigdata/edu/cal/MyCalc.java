package com.kbigdata.edu.cal;

// 계산 처리를 해주는 서비스.
public class MyCalc {
	Calculator calc;
	private int firstNum;
	private int secondNum;
	
	public MyCalc(){
		
	}
	
	public void setCalc(Calculator calc) {
		this.calc = calc;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public void setCalculator(Calculator calc) {
		this.calc = calc;
	}
	
	public void add() {
		calc.addition(firstNum, secondNum);
	}
	public void sub() {
		calc.sub(firstNum, secondNum);
	}
	public void mul() {
		calc.mul(firstNum, secondNum);
	}
	public void div() {
		calc.div(firstNum, secondNum);
	}
}
