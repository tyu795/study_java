package com.mycompany.study.ch06.third;

public class Arithmetic {
	
	// 더하기 함수
	
	public int add(int a,int b) {
		int y = a + b;
		return y;
	}
	
	//빼기 함수
	
	public int minus(int a,int b) {
		int y = a - b;
		return y;
	}
	
	
	//곱하기
	
	public int multi(int a,int b) {
		int y = a*b;
		return y;
	}
	
	public String changeName(String name) {
		String result;
		
		if(name.equals("장원영")) {
			result = "Tony";
		} else {
			result = "I don't know";
		}
		return result;
	}
	
		public void prettyWonyoungChang(String name) {
			switch (name) {
			case "아이브":
				System.out.println("장원영 존예");
				break;
			default:
				System.out.println("다른 사람은 그냥 예쁨");
				break;
			}
	
	}
	
		public int taken() {
			
			return 10000;
		}
		
		
		
	

}


