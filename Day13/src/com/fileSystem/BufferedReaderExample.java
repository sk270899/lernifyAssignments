package com.fileSystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fReader=new FileReader("helloBuffer.txt");
		BufferedReader bfReader=new BufferedReader(fReader);
		while(fReader.read()!=-1) {
			char c=(char) fReader.read();
			System.out.println(c);
		}
	}

}
