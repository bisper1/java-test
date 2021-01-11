package PortFolioQuestion4;

public interface Stack {
	int length(); // 현재 스택에 저장된 개수 리턴
	int capacity(); // 스택 전체 저장 가능한 개수 리턴
	String pop(); // 스택의 top에서 데이터 출력
	boolean push(String vale); // 스택의 top에 데이터 저장
}
