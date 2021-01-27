package com.iu.s2;

public class Operator_1 {
	
	public static void main(String [] args) {
		System.out.println(" ---- 프로그램 실행 ---- ");
		
		//형변환
		int num1 = 10;
		
		long num2 = 20L;
		
		// int -> long , long -> int
		//num2 = (long)num1 
		num2 = num1; //자동형변환
		
		num1 = (int)num2;//강제형변환
		
		num1 = 10;
		num2 = 20L;
		
		long num3 = num1+num2;
		
		// (1+2)*3 = 9
		//int num4 = (int)(num1 + num2);
		int num4 = num1 + (int)num2;
		
		
		System.out.println(num2);
		
		
		System.out.println(" ---- 프로그램 종료 ---- ");
	}

}
