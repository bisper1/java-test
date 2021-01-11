package Question1;

public class Calculator {

	public static void main(String[] args) {
//		1. 메서드 없이 클래스에 실행부분이 있음
//		메서드를 추가해야함, 직접 실행을 위해서는 main() 메서드가 필요함
//		main() 메서드를 추가
		int i;
	    int j;
	    i = 10;
	    j = 20;
	    System.out.println(i + j);
	    
//	    2. 클래스의 이름은 실제 파일명과 동일해야함
//	    Calculator.java
	    
//	    3. javac 는 컴파일을 위한 명령어이며, java는 컴파일을 통해서 실행파일인 class 파일로 변환된 파일을 JVM을 통해서 실행하는 명령어
//	    java 명령어는 실행하는 파일의 확장자가 class이므로 확장자를 빼고 파일명만 입력해도 상관없음
//	    java Calculator.class / java Calulator
	}

}
