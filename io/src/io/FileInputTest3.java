package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputTest3 {
	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = System.out;
		
		try {
			in = new FileInputStream(new File("c:\\temp\\file1.txt"));
			
			byte[] b = new byte[1024];
			while(in.read(b)!=-1) {
				out.write(b);
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
