package com.mycompany.study.ch03;

public class ExSignOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 부호 연산자
		
		int x = 100;
		
		int result1 = +x;
		int result2 = -x;
		
		System.out.println("result1:" + result1);
		System.out.println("result2:" + result2);
		
		// 증감 연산자(++,--)
		
		int i = 0;
		int j = 0;
		
		++i;
		j++;
		
		System.out.println("i:" + i);
		System.out.println("j:" + j);

		
		int a = 1;
		int b = 1;
		
		--a;
		b--;
		
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		
		
		int k = i++;
		int m = ++j;
		
		System.out.println("k:" + k);
		System.out.println("i:" + i);
		System.out.println("m:" + m);
		System.out.println("j:" + j);
		System.out.println("---------------");
		
		
		--i;
		int z = ++i + j++;
		System.out.println("z:" + z);
		System.out.println("i:" + i);
		System.out.println("j:" + j);
		System.out.println("---------------");
		
		
	}

}
