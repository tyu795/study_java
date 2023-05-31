package com.mycompany.study.ch04;

public class Exif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if - 학점 계산
		//A:90
		//B:89~80
		//c:79~70
		//d:69~60
		//f:59~
		
		
		int score = 97;
		
		if(score >= 90) {
			if(score >= 97) {
			System.out.println("당신의 학점은 A+ 입니다");
		} else if(score < 97 && score > 93) {
			System.out.println("당신의 학점은 A입니다");
		} else {
			System.out.println("당신의 학점은 A- 입니다");
		}
		} else if (score >= 80) {
			
		}
		
		
		
		/*
		 * else if(score >= 80) { System.out.println("당신의 학점은 B 입니다"); } else if(score
		 * >= 70) { System.out.println("당신의 학점은 C 입니다"); } else if(score >= 60) {
		 * System.out.println("당신의 학점은 D 입니다"); } else if(score <= 59) {
		 * System.out.println("당신의 학점은 F 입니다"); }
		 * 
		 */
		
		
		
		
	}

}
