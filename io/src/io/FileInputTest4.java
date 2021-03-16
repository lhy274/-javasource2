package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputTest4 {
	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = System.out;
		
		try {
			in = new FileInputStream(new File("c:\\temp\\picture.jpg"));
			out = new FileOutputStream(new File("c:\\temp\\picture_copy.jpg"));
			long start = System.currentTimeMillis();
			int date = 0;
//			while((date=in.read())!=-1) {
//				out.write(date);
//			}
			byte b[]=new byte[1024];
			while(in.read(b)!=-1) {
				out.write(b);
			}
			long end = System.currentTimeMillis();
			System.out.println("복사하는 데 걸린 시간 : "+(end-start));
			
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
