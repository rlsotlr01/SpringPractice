package com.kbigdata.edu.cal;

public class MainClass {

		public static void main(String[] args) {
			MyCalc myCalc = new MyCalc();
			myCalc.setCalc(new Calculator());
			myCalc.setFirstNum(10);
			myCalc.setSecondNum(2);
			myCalc.add();
			myCalc.sub();
			myCalc.div();
			myCalc.mul();
		}
}
