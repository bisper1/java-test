package PortFolioQuestion4;

public class StringStack implements Stack {
//	자바에서는 스택 자료구조가 존재하지 않음
//	배열을 가지고 스택 자료구조를 만들어서 사용해야 함
//	스택 자료구조를 배열 가지고 만들어서 사용할 수 있음
	private String[] arrStack; // 스택을 구현할 배열
	private int top; // 데이터가 저장될 위치
	
	public StringStack(int capacity) {
		arrStack = new String[capacity];
		top = -1; // top을 출력 시 -1이면 스택이 비어있음
	}
	
//	스택에 저장된 데이터의 개수
	@Override
	public int length() {
		return top + 1; // top의 기본값(비어있을 경우)을 -1로 주기 때문에 저장된 데이터 수를 출력시 +1을 해줌
	}
	
//	스택에 저장할 수 있는 데이터의 개수
	@Override
	public int capacity() {
		return arrStack.length;
	}
	
//	스택에 저장된 데이터를 출력
	@Override
	public String pop() {
//		top을 확인 후 크기가 -1이 아닐 경우 top의 위치에서 데이터 출력
		if (top == -1) {
			return null;
		}
		
		String item = arrStack[top];
		top--;
		return item;
	}
	
//	스택에 데이터를 저장
	@Override
	public boolean push(String value) {
		if (top == arrStack.length -1) {
			return false;
		}
		else {
			top++;
			arrStack[top] = value;
			return true;
		}
	}
}
