package com.kbigdata.edu.di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
//		spring container 동작
//		설정파일 읽어서 spring container 동작
		
		String configLocation = "classpath:applicationCTX_di.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
//		xml 파일을 읽어서 Spring container 를 만들라는 생성자
//		ApplicationContext -> Spring container
//		프레임워크는 라이브러리+틀 이라고 했음. 즉 기존에 사용하던 틀(방식)을 그대로 사용한다.
		
//		이제 Bean 을 get(추출) 해야 함.
//		Bean 추출 : myCalc => +, -, *, /
//		ctx -> 스프링 컨테이너. 스프링컨테이너한테 getbean 하도록 해야 함.
		MyCalc myCalc = ctx.getBean("myCalc", MyCalc.class);
		myCalc.add();
		myCalc.sub();
		myCalc.div();
		myCalc.mul();
		
	}

}
