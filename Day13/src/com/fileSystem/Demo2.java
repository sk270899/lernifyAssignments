package com.fileSystem;

import java.io.File;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("hello.txt");
		f.createNewFile();
		
		File f1 = new File("folder");
		f1.mkdir();
		
	}

}
