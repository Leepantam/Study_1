package com.iu.s3;

import java.util.Scanner;

public class Condition_1_ex1 {
	
	//main
	
	//키보드에서 입력(국어, 영어, 수학)
	//총점과 평균 계산
	//평균이 90점 이상이면 우수학생 출력
	//졸업 출력
	
	public static void main(String [] args) {
		//키보드 준비
		Scanner sc = new Scanner(System.in);
		
		int kor=0;
		int eng=0;
		int math=0;
		int total=0;
		double avr=0.0;
		
		System.out.println("국어 점수 입력");
		kor = sc.nextInt();
		
		System.out.println("영어 점수 입력");
		eng = sc.nextInt();
		
		System.out.println("수학 점수 입력");
		math = sc.nextInt();
		
		total = kor + eng + math;
		
		avr = total/3.0;
		
		if(avr>=90) {
			System.out.println("우수 학생");
		}
		
		System.out.println("졸업");
	}
	
	

}
