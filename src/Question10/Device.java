package Question10;

// 추상 메서드를 멤버로 가질 수 있는 것은 추상 클래스 및 인터페이스임
// 추상 클래스를 나타내는 public abstract나 인터페이스를 나타내는 public interface 를 입력하면 됨
// 정확한 답은 interface 임
public interface Device {
//	추상 메서드는 원래 abstract 키워드를 반드시 입력해야함
//	인터페이스의 멤버로 사용될 경우 abstract 키워드를 빼도 상관없음
//	인터페이스의 멤버는 상수, 정적 메서드, 디폴트 메서드, 추상 메서드밖에 없음
//	상수 및 정적 메서드는 반드시 static 키워드를 사용해야 하고, 디폴트 메서드 역시 default 키워드를 반드시 사용해야함
//	이로 인하여 abstract 키워드를 빼고 사용해도 자동적으로 public abstract를 컴파일러가 입력함
	
//	추상 클래스의 경우는 멤버로 일반 메서드를 가질 수 있기 때문에 일반 메서드와 추상 메서드를 구분하기 위해서 추상 메서드에 반드시 abstract를 붙여야 함
	void on();
	void off();
}
