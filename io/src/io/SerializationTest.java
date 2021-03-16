package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// Serialization(직렬화) : 객체가 가진 데이터들을 순차적인 데이터로 변환하는 것

public class SerializationTest {
	public static void main(String[] args) {
		person personLee = new person("이순신", "엔지니어");
		person personKim = new person("김유신", "선생님");
		
		try(FileOutputStream fos = new FileOutputStream("c:\\temp\\serial.dat");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			FileInputStream fis = new FileInputStream("c:\\temp\\serial.dat");
			ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			os.writeObject(personLee);
			os.writeObject(personKim);
			
			for(int i = 0; i <2;i++) {
				person p = (person)ois.readObject();
				System.out.println(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
