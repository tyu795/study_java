package com.mycompany.study.ch06.first;

public class ExCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		System.out.println(a);
		
		Car car = new Car();      // 생성
		
		System.out.println("car.name: " + car.engine);
		System.out.println("car.name: " + car.name);
		System.out.println("car.name: " + car.color);
		System.out.println("car.name: " + car.company);
		
		car.go();
		car.back();
		
		// 변수 호출
		MP3 mp3 = new MP3();
		
		// 
		System.out.println("mp3.size: " + mp3.size);
		System.out.println("mp3.color: " + mp3.color);
		System.out.println("mp3.name: " + mp3.name);
		System.out.println("mp3.company: " + mp3.company);
		
		
		
	}

}
