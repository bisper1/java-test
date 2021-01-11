package Question7;

//두 클래스가 상속받는 관계에 있을 경우 자손클래스의 생성자에서 부모 클래스의 생성자를 호출함
//부모 클래스가 기본 생성자를 사용할 경우 컴파일러가 자동으로 super()를 호출하지만 부모 클래스가 기본 생성자가 없을 경우 사용자가 직접 부모 클래스의 생성자를 호출해야 함

public class Answer7 extends A {
	private int b;
	
	public Answer7() {
		super(0); // 부모 클래스인 A의 생성자를 호출하는 부분
		b = 0;
	}

	public static void main(String[] args) {

		
	}

}
