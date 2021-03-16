package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamTest3 {

	public static void main(StringToByte[] args) {
		// 바이트 기반의 inputStream 생성
		InputStream in = System.in;
		//바이트 기반의 OutputStream 생성
		OutputStream out = System.out;
		
		//ASCII(영어,숫자)
		//키보드의 모든 키들은 특정 숫자값이 부여되어 있음
		// A : 65, a : 97
		
		int input = 0;
		//입력 스트림에서 한 바이트씩 읽어오기
		try {
			while((input = in.read())!=-1) {
			//System.out.println((char)input);
				out.write(input);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
