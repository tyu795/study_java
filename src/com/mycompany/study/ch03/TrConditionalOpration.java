package com.mycompany.study.ch03;

public class TrConditionalOpration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 삼항 연산자 (조건식) ? A:B
		
		int math = 85;
		
		char grade = (math>90)? 'A':'B';
		System.out.println("grade:" + grade);
		
		if(math>90) {
			grade = 'A';
		} else {
			grade = 'B';
		}
		System.out.println("grade:" + grade);
		
	}

}
