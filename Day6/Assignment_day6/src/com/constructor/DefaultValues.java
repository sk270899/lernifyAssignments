//Que1 Session 1 defalut values of static and instasnce variables
package com.constructor;

public class DefaultValues {
	byte a;
	short b;
	int c;
	float d;
	double e;
	char f;
	boolean g;
	
	static byte sa;
	static short sb;
	static int sc;
	static float sd;
	static double se;
	static char sf;
	static boolean sg;
	
	public static void main(String[] args) {
		DefaultValues dv = new DefaultValues();
		System.out.println("instance byte : "+dv.a);
	    System.out.println("instance short : "+dv.b);
	    System.out.println("instance int : "+dv.c);
	    System.out.println("instance float : "+dv.d);
	    System.out.println("instance double : "+dv.e);
	    System.out.println("instance char : "+dv.f);
	    System.out.println("instance boolean : "+dv.g);
	    
	    System.out.println();
	    
	    System.out.println("static byte : "+sa);
	    System.out.println("static short : "+sb);
	    System.out.println("static int : "+sc);
	    System.out.println("static float : "+sd);
	    System.out.println("static double : "+se);
	    System.out.println("static char : "+sf);
	    System.out.println("static boolean : "+sg);
	}
}
