package com.fileSystem;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fWriter=new FileWriter("hello.txt");
		fWriter.write("hello");
		fWriter.write("world");
		fWriter.write("file");
		fWriter.close();
	}

}
