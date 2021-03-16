package io;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;

public class IOTest {// ㅅㅂ 존나 아름다워

	public static void main(String[] args) {
		// 키보드에서 입력을 받아들여 파일에 출력하는 프로그램 작성
		// 조건 : 키보드에서 q가 입력되기 전까지 계속 받아들이기

		// byte[] b = new byte[100];
		try (Scanner sc = new Scanner(System.in);
				FileWriter fw = new FileWriter("c:\\temp\\user.txt");
				BufferedWriter bw = new BufferedWriter(fw)) {

			System.out.println("파일에 작성할 데이터를 입력해 주세요");
			System.out.println("종료를 원하시면 q 를 입력해 주세요");

			String input = "";

			do {
				System.out.println(">> ");
				input = sc.nextLine();

				// 저장
				if (!input.equals("q")) {
					bw.write(input);
					bw.newLine();
				}
				//		 input.contains("q")
			} while (!input.equals("q"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

//		byte[] b = new byte[100];
//		try(Scanner sc = new Scanner(System.in);
//				Writer writer = new FileWriter("c:\\temp\\IOTest.txt")) {
//			//FileInputStream fis = new FileInputStream("c:\\temp\\IOTest.txt")) {
//			
//			while(sc.nextInt()!=-1) {
//				writer.write();
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}