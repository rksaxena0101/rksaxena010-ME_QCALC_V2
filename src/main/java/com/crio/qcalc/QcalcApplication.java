package com.crio.qcalc;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args);
		System.out.println("Starting QCalc..");
		StandardCalculator calc = new StandardCalculator();
        //calc.add(1, 2);
        //System.out.println(calc.getResult());
		//calc.add(Double.MAX_VALUE, 1.0);
		//calc.printResult();

		calc.add(Double.MAX_VALUE, Double.MAX_VALUE);

		calc.printResult();


	}

}
