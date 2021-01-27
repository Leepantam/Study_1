package com.iu.s3;

import java.util.Scanner;

public class Condition_1_ex3 {//scope
	
	
	
	//main 생성
	//키보드 입력
	//국어, 영어, 수학 입력 받아서 총점 과 평균 계산
	//평균이 90점 이상이면 A 출력
	//평균이 80점 이상이면 B 출력
	//평균이 70점 이상이면 C 출력
	//평균이 60점 이상이면 D 출력
	//평균이 60점 미만이면 F 출력
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int kor=0;
		int eng=0;
		int math=0;
		int total=0;
		double avr=0;
		String point="F";//null
		
		System.out.println("국어 점수 입력");
		kor = sc.nextInt();
		
		System.out.println("영어 점수 입력");
		eng = sc.nextInt();
		
		System.out.println("수학 점수 입력");
		math = sc.nextInt();
		
		total = kor + eng + math;
		avr = total/3.0;
		
		if(avr>=90) {
			point="A";
			int price=200;
			System.out.println(price);
		}
		
		if(avr<90) {
			if(avr>=80) {
				point="B";
			}
		}
		
		
		
//		if(avr<60) {
//			point="F";
//		}
		System.out.println(price);
		System.out.println(point);
		System.out.println("프로그램 종료");
	}//메인 끝
	
	

}
