package com.mycompany.study.ch04;

public class ExForHigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 for (int i = 1; i <= 5; i++) {
	            for (int j = 1; j <= 10; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	       
		 	}
	
			
		 	// 박스 만들기
			System.out.println("-------------------");
			
		
			for(int i=1; i<=5; i++) {
				for(int j=1; j<=10; j++) {
					if(i>=2 && i<=4) {
						if(j>=2 && j<=9) {
							System.out.print(" ");
						} else {
							System.out.print("*");
						}
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
			System.out.println("-------------------");
	    }
	}
