package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileReaderTest1 {// 테스트2에다가 할것을 1에다가 하고 있음.//옮김
	public static void main(String[] args) {
		// Reader, Writer 사용 - 문자로 된 파일만 가능

		try (Reader reader = new FileReader("c:\\temp\\file1.txt")) {
			int ch = 0;
			while ((ch = reader.read()) != -1) {
				System.out.print((char) ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
