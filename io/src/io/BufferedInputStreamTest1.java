package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedInputStreamTest1 {

	public static void main(String[] args) { // 이거 안 만들어지네 // 아직 덜 한 거였네 // copy 1,3은 그대로 나왔고, copy2는 안나옴-깨짐.
		try(InputStream in = new FileInputStream("c:\\temp\\file1.txt");
				BufferedInputStream bis = new BufferedInputStream(in);
				OutputStream out = new FileOutputStream("C:\\temp\\file1_copy3.txt");
				BufferedOutputStream bos = new BufferedOutputStream(out)) {
			
			int data = 0;
			while((data=in.read())!=-1) {
				bos.write(data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
