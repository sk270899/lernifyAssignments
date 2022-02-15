package com.setmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapAndEntrySet {
	public static void main(String[] args) {
		Map<Integer,String> mp = new HashMap<>();
		mp.put(1, "sahil");
		mp.put(2, "khandelwal");
		mp.put(3, null);
		mp.put(4, "lol");
		
		System.out.println(mp);
		Set<Entry<Integer, String>> setObj = mp.entrySet();
		System.out.println(setObj);
	}
}
