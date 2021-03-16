package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedInputStreamTest2 {

	public static void main(String[] args) { // 이거 안 만들어지네 // 아직 덜 한 거였네 // copy 1,3은 그대로 나왔고, copy2는 안나옴-깨짐.
		try(InputStream in = new FileInputStream("c:\\temp\\Sleep Away.mp3")) {
			
			int data = 0;
			long start = System.currentTimeMillis();
			while((data=in.read())!=-1) {

			}
			long end = System.currentTimeMillis();
			System.out.println("inputStream 만 사용할 때 : "+(end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		///2
		
		try(InputStream in = new FileInputStream("c:\\temp\\Sleep Away.mp3");
				BufferedInputStream bis = new BufferedInputStream(in)) {
			
			int data = 0;
			long start = System.currentTimeMillis();
			while((data=in.read())!=-1) {
				
			}
			long end = System.currentTimeMillis();
			System.out.println("inputStream + BufferedInputStream 만 사용할 때 : "+(end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		///3  - input+bufferedinput 만 사용한 거랑 차이 없음. 4번이 진짜야.
		
//		try(InputStream in = new FileInputStream("c:\\temp\\Sleep Away.mp3");
//				BufferedInputStream bis = new BufferedInputStream(in);
//				OutputStream out = new FileOutputStream("C:\\temp\\Sleep Away_copy2.mp3");
//				BufferedOutputStream bos = new BufferedOutputStream(out)) {
//			
//			int data = 0;
//			long start = System.currentTimeMillis();
//			while((data=in.read())!=-1) {
//				bos.write(data);
//			}
//			long end = System.currentTimeMillis();
//			System.out.println("input/output시 보조스트림 사용할 때 : "+(end-start));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		/////4
		
		try(InputStream in = new FileInputStream("c:\\temp\\Sleep Away.mp3");
				BufferedInputStream bis = new BufferedInputStream(in);
				OutputStream out = new FileOutputStream("C:\\temp\\Sleep Away_copy3.mp3");
				BufferedOutputStream bos = new BufferedOutputStream(out)) {
			
			int data = 0;
			
			byte b[] = new byte[8192];
			long start = System.currentTimeMillis();
			while((data=in.read(b))!=-1) {
				bos.write(b);
			}
			long end = System.currentTimeMillis();
			System.out.println("input/output시 보조스트림 + 바이트 배열 사용할 때 : "+(end-start));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}// static void main end

}
