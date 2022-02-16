package com.fileSystem;

import java.io.File;
import java.io.IOException;

public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("hello.txt");
		f.createNewFile();
	}
	

}
