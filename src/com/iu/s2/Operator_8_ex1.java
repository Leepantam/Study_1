package com.iu.s2;

import java.util.Scanner;

public class Operator_8_ex1 {
	
	//메인 메서드 생성
	
	//나이를 키보드로 부터 입력
	//10대냐 아니냐
	// 나이가 9보다는 크고  나이가 20보다는 작아야
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int age=0;
		String result="";
		
		System.out.println("나이를 입력하세요");
		age = sc.nextInt();
		
		// 9<age<20
		
		result = age>9 && age<20?"10대입니다":"10대가 아닙니다";
		
		System.out.println(result);
		
		
	}
	

}
