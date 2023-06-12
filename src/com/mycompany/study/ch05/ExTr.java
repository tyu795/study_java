package com.mycompany.study.ch05;

public class ExTr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 정사각형 찍기
		for(int i = 1; i<=5; i++) {
			for(int j =1; j<=5; j++) {
				System.out.print(" *");
			}
				System.out.println("");
		}	
				System.out.println("----------------------");
		
		
		// 왼쪽으로 기운 삼각형
				
		int num = 5;
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}	System.out.println("-------------------");
	
		
	
	
		
		
		
		
		
		
		
		


	}

}
