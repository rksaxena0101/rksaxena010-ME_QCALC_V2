package com.crio.qcalc;

import com.crio.qcalc.StandardCalculator;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args);
		//System.out.println("Hello world!");
		StandardCalculator calc = new StandardCalculator();
		int result  = calc.add(1, 1);
		System.out.println(result);
	}
}
