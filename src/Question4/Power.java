package Question4;

public class Power {
	public int kick;
	public int punch;
	
//	1. 생성자를 이용하여 수정
//	1.1 기본 생성자에 사용할 기본 값을 지정하는 방식
//	1.2 매개변수가 존재하는 생성자를 사용하여 멤버 변수를 초기화 하는 방식
//	1.3 기본 생성자와 매개변수가 존재하는 생성자를 다 사용하고, this() 를 사용하는 방식
	public Power() {
		this(10, 20);
//		kick = 10;
//		punch = 20;
	}
	
	public Power(int kick, int punch) {
		this.kick = kick;
		this.punch = punch;
	}
	
//	2. 메서드를 사용하는 방식으로 수정
	public void setup(int kick, int punch) {
		this.kick = kick;
		this.punch = punch;
	}
}
