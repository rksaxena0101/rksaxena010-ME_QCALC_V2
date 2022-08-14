package com.crio.qcalc;

public class StandardCalculator {

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

    public int add(int num1, int num2) {
        return (num1 + num2);
    }


    public int subtract(int num1, int num2) {
        return (num1 > num2) ? (num1 - num2) : (num2 - num1);
    }


    public int multiply(int num1, int num2) {
        return (num1 * num2);
    }


    public int divide(int num1, int num2) {
        return (num1/num2);
    }

}
