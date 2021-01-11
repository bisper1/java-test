package PortFolioQuestion4;

import java.util.Scanner;

public class StackMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int n = sc.nextInt();
		
		StringStack ss = new StringStack(n);
		
		while (true) {
			System.out.print("문자열 입력 >> ");
			String str = sc.next();
			
//			사용자 입력 문자열이 '그만'이면 입력 중단
			if (str.equals("그만")) {
				break;
			}
			
//			스택에 데이터 저장 후 결과값 반환
			boolean res = ss.push(str);
			if (res == false) {
				System.out.println("스택이 꽉 차서 푸시 불가");
			}
		}
		
		
		System.out.print("스택에 저장된 모든 문자열 팝업 >> ");
//		스택의 크기 출력
		int length = ss.length();
		for (int i = 0; i < length; i++) {
//			pop을 통하여 저장된 모든 내용 출력
			System.out.print(ss.pop() + "  ");
		}
		
		sc.close();
	}

}
