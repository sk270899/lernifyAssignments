package com.fileSystem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWritterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fileWriter=new FileWriter("helloBuffer.txt");
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		bufferedWriter.write("hello world !");
		bufferedWriter.close();
	}

}
