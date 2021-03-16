package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutStreamTest1 {
	
	// DateOutputStream, DateInputStram : 기본 자료형 단위로 읽고 쓰기
	// 기본 자료형 : boolean, char, byte, short, int, long, float, double
	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("c:\\temp\\primitive.dat");
				DataOutputStream dos = new DataOutputStream(fos);
				FileInputStream fis = new FileInputStream("c:\\temp\\primitive.dat");
				DataInputStream dis = new DataInputStream(fis)) {
			
			//기본 타입으로 파일에 쓰기
			dos.writeUTF("홍길동");
			dos.writeDouble(95.5);
			dos.writeInt(10);
			
			dos.writeUTF("김자바");
			dos.writeDouble(97.5);
			dos.writeInt(2);
			
			//기본 타입으로 작성된 파일 읽어오기
			for(int i=0;i<2;i++) {
				String name = dis.readUTF();
				double jumsu = dis.readDouble();
				int num = dis.readInt();
				System.out.println(num+" : "+name+"("+jumsu+")");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
