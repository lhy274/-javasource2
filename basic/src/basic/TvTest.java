package basic;

public class TvTest {

	public static void main(String[] args) {
		
		//인스턴스(객체) 생성 => 생성자// //객체를 생성할 때 아무런 인자도 넣지 않는다면 default 생성자 호출
		
		TV t1 = new TV();
		TV t2 = new TV(true, 11, 153);
		
//		System.out.println("t1 채널 값 : "+t1.channel);
//		
//		t1.channel = 8;
//		System.out.println("t1 채널 값 : "+t1.channel);
		
		t1.channelUp();
		
		//리턴 타입이 있는 메소드 호출
		
		// 처리방법 1 => 출력문에서 확인하기
		System.out.println(t1.getChannel());
		
		// 처리방법 2 => 넘어오는 값 받기
		int channel_no = t1.getChannel();
		//double channel_no2 = t1.getChannel();
		//float channel_no3 = t1.getChannel();
		// 받아서 다른 처리가 가능함
		
		// 리턴타입이 없는 메소드 : void
		
		// 호출만 가능
		t1.channelDown();
		//System.out.println(t1.channelDown());
	}

}












