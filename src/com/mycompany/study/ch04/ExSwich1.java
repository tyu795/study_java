package com.mycompany.study.ch04;

public class ExSwich1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String position = "나";
		
		switch(position) {
			case "사장":
				System.out.println("사장의 연봉은 500만원 입니다.");
				break;
			case "부장":
				System.out.println("부장 연봉은 100만원 입니다.");
				break;
			case "나" :
				System.out.println("내 연봉은 세계1위 부자 되는거임^^");
				break;
			default :
					System.out.println("빈값입니다");
				break;
		}
		
	}

}
