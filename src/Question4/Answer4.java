package Question4;

public class Answer4 {

	public static void main(String[] args) {
//		1. 생성자를 사용하는 방식
		Power robot1 = new Power(10, 20);
//		Power robot1 = new Power();
		
		
//		2. 메서드를 사용하는 방식
		Power robot2 = new Power();
		robot2.setup(10, 20);
	}

}
