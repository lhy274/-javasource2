package test201116;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class HelloJava {

	public static void main(String[] args) {
		// 키보드에서 입력을 받아들여 파일에 출력하는 프로그램 작성
				// 조건 : 키보드에서 q가 입력되기 전까지 계속 받아들이기
		
		
		
		
		
		
		
		
		
		
	}

}
//1
//		try(Scanner sc = new Scanner(System.in);
//				FileWriter writer = new FileWriter("c:\\temp\\Hellotest1.txt");
//				BufferedWriter bw = new BufferedWriter(writer)) {
//			
//				System.out.println("저장할 문장을 입력하세요.\n종료를 원하시면 'q'를 입력하세요");
//				String input = null;
//				
//			do {
//				System.out.print(">> ");
//				input = sc.nextLine();
//				
//				if(!input.equals("q")) {
//					bw.write(input);
//					bw.newLine();
//				}
//				
//			}while(!input.equals("q"));
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}


//2
//		try(Scanner sc = new Scanner(System.in);
//			FileWriter writer = new FileWriter("c:\\temp\\HelloTest3.txt");
//			BufferedWriter bw = new BufferedWriter(writer)) {
//			
//			System.out.println("입력하세요.\n'q'를 누르시면 종료합니다.");
//			String data = "";
//			do {
//				System.out.println(">> ");
//				data = sc.nextLine();
//				if(!data.equals("q")) {
//					bw.write(data);
//					bw.newLine();
//				}
//				
//			}while(!data.equals("q"));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}