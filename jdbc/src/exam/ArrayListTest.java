package exam;

import java.util.ArrayList;
import java.util.List;

/*�����͸� ��� ���� ���ΰ�? �⺻��Ÿ��, Ŭ����(��ü) Ÿ��
*
*�⺻�� : int, float, double, char
*��ü : Integer, Float,Double, String.....
*
*�����Ͱ� �������� : �迭, Collection(List, Set), Map
*
*List : ArrayList, LinkedList, 
*
*
*/


public class ArrayListTest {

	public static void main(String[] args) {
		//List��ü ����
		List<String> list = new ArrayList<String>();
		
		//������ list�� ��� �߰�
		list.add("Java");
		list.add("JDBC");
		list.add("oracle");
		list.add("html");
		
		//��� Ȯ��
		
		//��ü ��� Ȯ��
		for(String str:list) {
			System.out.println(str);
		}
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
		
		
		
		
		System.out.println();
		//Ư�� ��� Ȯ��
		System.out.println(list.get(2));
		
		
		
		
		
	}

}
