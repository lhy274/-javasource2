package basic;

/* 클래스 : 틀, 설계도, 객체를 생성하는데 사용
 * 객체 : 유형, 무형
 * 
 * 인스턴스화 : 클래스로부터 객체를 만드는 과정
 * 인스턴스 : 어떤 클래스로부터 만들어진 객체
 * 
 * 객체 >= 인스턴스
 * 
 * 책상은 객체다.
 * 책상은 책상 클래스의 인스턴스다.
 * 
 * 객체 구성요소 - 속성, 기능
 * 속성 - 멤버변수, 필드, property
 * 기능 - 메소드, 함수
 */


public class TV {
	// 속성 - 전원상태, 크기, 색상, 볼륨, 채널
	// 기능 - 켜기,끄기, 볼륨 up, down, 채널 변경
	
	private boolean power;
	private String color;
	private int volume;
	private int channel;
	
	// 현재 채널값을 리턴
	int getChannel() {
		return channel;
	}
	
	//생성자 - 클래스 이름과 동일하게 작성/리턴 타입은 없음/접근제한자
	//		 생성자가 아무것도 없을 때 컴파일러가 자동으로 default 생성자 생성
	// 		생성자가 하나라도 있으면 default 는 안 만들어줌
	public TV() {
		
	}
	
	public TV(boolean power, int volume, int channel) {
		
	}
	
	
	
	
	
	//현재 채널값을 리턴
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	
	
}
