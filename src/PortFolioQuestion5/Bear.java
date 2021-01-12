package PortFolioQuestion5;

import java.util.Scanner;

public class Bear extends GameObject {
	private Scanner sc; // 사용자의 키보드 입력 받기
	
	public Bear(int x, int y, int distance) {
		super(x, y, distance);
		sc = new Scanner(System.in);
	}

//	이동한 후의 새로운 위치로 x, y 변경
	@Override
	protected void move() {
		System.out.print("왼쪽(a), 아래(s), 오른쪽(d), 위(w) : ");
		String str = sc.next(); // 사용자의 문자열 입력
		char input = str.charAt(0); // 입력된 문자열 중 첫번째 문자를 가져옴
		
		switch (input) {
		case 'a': // 왼쪽
			x--;
			
//			화면 왼쪽 끝에서 더이상 움직일 수 없음
			if (x < 0) {
				x = 0;
			}
			break;
			
		case 's': // 아래
			y++;
			
			if (y >= Game.MAX_Y) {
//				맵의 위치가 0부터 시작이기 때문에 -1을 함
				y = Game.MAX_Y - 1;
			}
			break;
			
		case 'd': // 오른쪽
			x++;
			
			if (x >= Game.MAX_X) {
//				맵의 위치가 0부터 시작이기 때문에 -1을 함
				x = Game.MAX_X - 1;
			}
			break;
			
		case 'w': // 위
			y--;
			
//			범위를 벗어나지 못 하도록 확인 후 값 변경
			if (y < 0) {
				y = 0;
			}
			break;
			
		default:
			System.out.println("잘못 입력하셨습니다.");
			System.out.print("왼쪽(a), 아래(s), 오른쪽(d), 위(w) : ");
		}
	}
	
//	Bear를 나타내는 문자 리턴
	@Override
	protected char getShape() {
		return 'B';
	}
}
