package com.kbigdata.edu.student;

import java.util.ArrayList;

public class MyInfo {
	private String name;
	private double height;
	private double weight;
	private ArrayList<String> hobbies;
	private BMICalc bmiCalc;
	public BMICalc getBmiCalc() {
		return bmiCalc;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}
	public void bmiCalc() {
		bmiCalc.bmiCalc(weight, height);
	}
	
//	전체 정보를 출력하는 메소드
	public void getInfo() {
		System.out.println("이름 : "+this.name);
		System.out.println("키 : "+this.height);
		System.out.println("몸무게 : "+this.weight);
		System.out.println("취미 : "+this.hobbies);
		bmiCalc();
	}
	
}
