package com.mycompany.study.ch04;

public class ExFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=2; i < 10; i++) {
			System.out.println(i + "단을 출력 합니다.");
			
            
			for(int j=1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println("-------------------");
		}	
	}
}