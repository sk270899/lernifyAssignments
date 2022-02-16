package com.fileSystem;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		try (// TODO Auto-generated method stub
		FileReader fileReader = new FileReader("fileReader.txt")) {
			
			while(fileReader.read()!=-1) {
				char c=(char) fileReader.read();
				System.out.println(c);
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR");
		}
	}

}
