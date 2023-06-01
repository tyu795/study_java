package com.mycompany.study.ch04;

public class Exif4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -2;
		int b = 0;
		
		
		if(a>0 && b>0) {
			System.out.println("(a,b)는 1사분면에 위치합니다");
		} else if(a<0 && b>0) {
			System.out.println("(a,b)는 2사분면에 위치합니다");
		} else if(a<0 && b<0) {
			System.out.println("(a,b)는 3사분면에 위치합니다");
		} else if(a>0 && b<0) {
			System.out.println("(a,b)는 4사분면에 위치합니다");
		} else if(a==0 && b!= 0) {
			System.out.println("(a,b)는 x축 위에 있습니다");
		} else if(a!=0 && b== 0) {
			System.out.println("(a,b)는 y축 위에 있습니다");
		} else {
			// a==0 & b==0
			System.out.println("(a,b)는 원점입니다.");
		}
	}

}
