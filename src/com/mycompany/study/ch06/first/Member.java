package com.mycompany.study.ch06.first;

public class Member {
	
	// 회원 객체 만들기
	
	String name;
	String id;
	String password;
	String email;
	
	void create() {
		System.out.println("회원정보 등록");
	}
	void delete() {
		System.out.println("회원 탈퇴");
	}
	void search() {
		System.out.println("회원정보 조회하기");
	}
	void update() {
		System.out.println("회원정보 수정");
	}
	
	
	
	
}
