package Question10;

public class TV implements Device {
	@Override
	public void on() {
		System.out.println("TV가 켜졌습니다.");
	}
	
	@Override
	public void off() {
		System.out.println("TV가 꺼졌습니다.");
	}

	public void watch() {
		System.out.println("TV를 시청중입니다.");
	}
	
	public static void main(String[] args) {
		TV myTV = new TV();
		myTV.on();
		myTV.watch();
		myTV.off();
	}

}
