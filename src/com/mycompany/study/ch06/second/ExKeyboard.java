package com.mycompany.study.ch06.second;

public class ExKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Keyboard keyboard = new Keyboard();
		
		System.out.println("내가 갖고싶은 키보드: " + keyboard.company);
		System.out.println("색상은: " + keyboard.color);
		
		keyboard.press();
		
		
	}

}
