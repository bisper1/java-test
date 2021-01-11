package Question3;

public class Answer3 {

	public static void main(String[] args) {
		String in = "바위";
		
		switch (in) {
		case "가위":
			System.out.println(1);
			break;
			
		case "바위":
			System.out.println(2);
			break;
			
		case "보":
			System.out.println(3);
			break;
			
		default:
			System.out.println(0);
			break;
		}
	}

}
