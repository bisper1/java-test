package Question2;

public class Answer2 {

	public static void main(String[] args) {
//		기존엔 10번줄이 if (i % 3 == 0) 으로 되어 있어서 3의 배수를 확인할 수 있는 형태였음
		int i = 4;
		
		if (i % 2 == 0) {
			if (i % 6 == 0) {
				System.out.println("6의 배수입니다.");
			}
		}
		else {
			System.out.println("홀수입니다.");
		}
	}

}
