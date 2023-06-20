package com.mycompany.study.ch15.forth;

import java.util.HashMap;
import java.util.Map;

public class ExHashMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
		map.put("장원영",100);
		map.put("전지현",99);
		map.put("장동건",98);
		map.put("이제훈",97);
		
//		System.out.println("map.get(\"이제훈\"): " + map.get("이제훈"));
		
		map.remove("장동건");
		map.clear();
		
		for( String strKey : map.keySet() ) {
			Integer strValue = map.get(strKey);
			System.out.println( strKey + ":" + strValue);
		}
		
		
		
	}

}

