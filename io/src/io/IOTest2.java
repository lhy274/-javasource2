package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class IOTest2 {

	public static void main(String[] args) {
		// 아무파일이나 선택한 후 소스파일을 읽고
		// 라인번호를 추가시켜 화면에 출력하기

		// C:\javasource\io
		String path = System.getProperty("user.dir");
		// System.out.println(path); // 현재경로 알고 싶으면 이렇게 출력해서 알아보면됨.
		try (FileReader reader = new FileReader(path + "\\src\\io\\FileEx1.java");
				BufferedReader br = new BufferedReader(reader)) {

			String data = null;
			int i = 1;
			while ((data = br.readLine()) != null) {
				System.out.println((i++) + " " + data);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

//try(Reader rd = new FileReader("C:\\javasource\\io\\src\\io\\FileEx1.java")) {
//	//FileWriter wt = new FileWriter("C:\\javasource\\io\\src\\io\\FileEx1.java")) {
//	
//	for(int i=0;i<2;i++) {
//		rd.read();
//		System.out.println(rd);
//	}
//	
//	
//} catch (Exception e) {
//	e.printStackTrace();
//}