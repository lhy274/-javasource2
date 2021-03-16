package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputTest1 {
	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = System.out;
		
		try {
			in = new FileInputStream(new File("c:\\temp\\file1.txt"));
			
			int date=0;
			while((date=in.read())!=-1) {
				out.write(date);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
			in.close();
			out.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

}
}
