package io;

import java.io.IOException;
import java.io.InputStream;

public class SystemInEx1 {

	public static void main(StringToByte[] args) throws IOException {
		System.out.println("==메뉴==");
		
		System.out.println("1. 에금 조회");
		System.out.println("2. 예금 출금");
		System.out.println("3. 예금 입금");
		System.out.println("4. 종료");
		
		System.out.println("메뉴 선택");
		
		
		InputStream in = System.in;
		char input = (char)in.read();
		
		switch (input) {
		case '1':
			System.out.println("에금 조회  선택");
			break;
		case '2':
			System.out.println("에금 출금 선택");
			break;
		case '3':
			System.out.println("에금 입금  선택");
			break;
		case '4':
			System.out.println("종료  선택");
			break;

		default:
			break;
		}
	}

}
