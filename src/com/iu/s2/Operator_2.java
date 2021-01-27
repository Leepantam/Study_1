package com.iu.s2;

public class Operator_2 {
	
	public static void main(String [] args) {
		
		//int  4
		//long 8
		
		//float 4
		//double 8
		
		long num1 = 20;
		
		float num2 = 3.2f;
		
		// num1 = num2; 자동형변환
		num1 = (long)num2; //강제형변환
		//num2 = num1; 강제형변환
		num2 = num1;       //자동형변환
		
		int point = 290;
		
		//double avr = (double)point/3;
		double avr = point/3.0;
		
		System.out.println(avr);
		
		
		avr = 10.1;
		
		System.out.println(avr*3);
		
		avr = 1.33333;
		int n = (int)avr;
		
		System.out.println(n);
		
	}

}
