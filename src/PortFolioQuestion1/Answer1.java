package PortFolioQuestion1;

import java.util.Scanner;
// 포트폴리오 문제 1번
public class Answer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가위, 바위, 보 게임입니다.");
		System.out.println(" 가위, 바위, 보 중에서 입력하세요");
		System.out.print("철수 >> ");
		String num1 = sc.next();
		System.out.print("영희 >> ");;
		String num2 = sc.next();
		
//		철수가 가위 였을 경우
		if (num1.equals("가위")) {
			if (num2.equals("가위")) {
				System.out.println("비겼습니다.");
			}
			else if (num2.equals("바위")) {
				System.out.println("영희가 이겼습니다.");
			}
			else if (num2.equals("보")) {
				System.out.println("철수가 이겼습니다.");
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
//		철수가 바위 였을 경우
		else if (num1.equals("바위")) {
			if (num2.equals("가위")) {
				System.out.println("철수가 이겼습니다.");
			}
			else if (num2.equals("바위")) {
				System.out.println("비겼습니다.");
			}
			else if (num2.equals("보")) {
				System.out.println("영희가 이겼습니다.");
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
//		철수가 보 였을 경우
		else if (num1.equals("보")) {
			if (num2.equals("가위")) {
				System.out.println("영희가 이겼습니다.");
			}
			else if (num2.equals("바위")) {
				System.out.println("철수가 이겼습니다.");
			}
			else if (num2.equals("보")) {
				System.out.println("비겼습니다.");
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
//		철수가 잘 못 입력받았을 경우
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		sc.close();
	}

}
