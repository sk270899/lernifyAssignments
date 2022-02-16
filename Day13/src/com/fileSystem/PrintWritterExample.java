package com.fileSystem;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWritterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fileWriter=new FileWriter("printWritter.txt");
		PrintWriter printWritterr=new PrintWriter(fileWriter);
		printWritterr.write("hello");
		printWritterr.write("world");
		printWritterr.write(" !");
		printWritterr.write(10);
		printWritterr.close();
	}

}
