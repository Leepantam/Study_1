package com.iu.s2;

public class Operator_9 {

	
	public static void main(String [] args) {
		
		int count=1;
		
		System.out.println(count);
		
		count = count+1;
		
		System.out.println(count);
		
		count = count+1;
		
		System.out.println(count);
		
		//증감 연산자 자기자신을 1 증가 시키거나 1 감소 시키는 연산자
		
		int num=1;
		
		System.out.println("num : "+num);
		
		++num;//num = num+1;
		
		System.out.println("num : "+num);
		
		--num;//num = num-1;
		
		System.out.println("num : "+num);//1
		
		num++;//num=num+1;
		System.out.println("num : "+num);//2
		
		num--;//num = num-1;
		System.out.println("num : "+num);//
		
		num=1;
		
		count = ++num;
		//num=num+1;
		//count=num;
		System.out.println("------------------------");//1
		System.out.println("count : "+count);//2
		System.out.println("num : "+num);//2
		
		num=1;
		count=1;
		count = num++;
		
		//count=num;
		//num=num+1;
		
		System.out.println("------------------------");
		System.out.println("count : "+count);
		System.out.println("num : "+num);
		
		num=1;
		count=1;
		count = 1+num++;
		System.out.println("------------------------");
		System.out.println("count : "+count);//?
		System.out.println("num : "+num);//?
		
		num=1;
		System.out.println("------------------------");
		System.out.println(num++);//?
		System.out.println(num);//?
		
		count = num--;
		count = --num;
		
		
	}
}
