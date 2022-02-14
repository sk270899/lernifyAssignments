package com.wrapper;

public class EnumClass {
	public enum Week {monday, tuesday, wednesday, thursday, friday, saturday, sunday}
	
	public static void main(String[] args) {
		for(Week w : Week.values()) {
			System.out.println(w);
		}
	}
}
