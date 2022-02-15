package com.setmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> mp = new HashMap<>();
		mp.put(1, "sahil");
		mp.put(2, "khandelwal");
		mp.put(3, null);
		mp.put(4, "lol");
		
		System.out.println(mp.values());
	}

}
