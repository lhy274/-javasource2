package exam;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {
	public static void main(String[] args) {
		List<Member> list = new ArrayList<Member>();
		
		list.add(new Member(1234, "ȫ�浿"));
		list.add(new Member(1234, "�ڱ浿"));
		list.add(new Member(1234, "��浿"));
		list.add(new Member(1234, "�ֱ浿"));
		list.add(new Member(1234, "�̱浿"));
		
		for(Member mem:list) {
			System.out.println(mem);
		}
		
		
		
		
	}

}
