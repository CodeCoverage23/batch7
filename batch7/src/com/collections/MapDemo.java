package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<>();

		m.put(101, "Ram");
		m.put(102, "Ram");
		m.put(103, "Ram");
		m.put(105, "Ram");
		m.put(106, "Ram");
		m.put(107, "Ram");
		m.put(108, "Ram");

		System.out.println(m);

		Map<String, String> map = new HashMap<>();

		map.put("Java", "Program");
		map.put("Java", "Program");
		map.put("Code", "Coverage");
		map.put("Code", "Coverage");

		System.out.println(map);

		for (Map.Entry<String, String> m1 : map.entrySet()) {
			System.out.println(m1);
			System.out.println(m1.getKey());
			System.out.println(m1.getValue());
		}
	}

}
