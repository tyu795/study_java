package com.mycompany.study.ch04;

public class Exif2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int grade = 5;
		int cost = 12000;
		
		if(grade == 1) {
			System.out.println("정가가" + cost + "원인 " + grade + "등급의 할인가는 " + (int) (cost * .95) + "원입니다");
		} else if(grade == 2) {
			System.out.println("정가가" + cost + "원인 " + grade + "등급의 할인가는 " + (int) (cost * .9) + "원입니다");
		} else if(grade == 3) {
			System.out.println("정가가" + cost + "원인 " + grade + "등급의 할인가는 " + (int) (cost * .85) + "원입니다");
		} else if(grade == 4) {
			System.out.println("정가가" + cost + "원인 " + grade + "등급의 할인가는 " + (int) (cost * .8) + "원입니다");
		} else {
			System.out.println("정가가" + cost + "원인 " + grade + "등급의 할인가는 " + (int) (cost * .973) + "원입니다");
		}
		
		
	}

}
