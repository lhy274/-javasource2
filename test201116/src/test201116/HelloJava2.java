package test201116;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class HelloJava2 {

	public static void main(String[] args) {
		// 아무파일이나 선택한 후 소스파일을 읽고
		// 라인번호를 추가시켜 화면에 출력하기

		System.out.println(System.getProperty("user.dir"));
		try(FileReader reader = new FileReader("C:\\javasource\\io\\src\\io\\FileEx4.java");
			BufferedReader br = new BufferedReader(reader)) {
			
			String input = null;
			int i = 0;
			
			while((input=br.readLine())!=null) {
				System.out.println((i++)+" "+input);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}

//		// System.out.println("user.dir ="+System.getProperty("user.dir"));
////		 String path = System.getProperty("user.dir");
////		  System.out.println(path);
//		try (FileReader fi = new FileReader("C:\\javasource\\io\\FileEx2.java");
//				BufferedReader fo = new BufferedReader(fi)) {
//
//			String data = "";
//			int i = 0;
//			while ((data = fo.readLine()) != null) {
//				System.out.println((i++) + "" + data);
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}