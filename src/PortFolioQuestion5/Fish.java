package PortFolioQuestion5;

// Fish는 자동으로 움직이기 때문에 사용자 입력을 받을 Scanner가 필요없음
public class Fish extends GameObject {
	public Fish(int x, int y, int distance) {
		super(x, y, distance);
	}
	
	@Override
	protected void move() {
//		5번 중 2번만 이동, 3번은 그대로 정지
//		랜덤 숫자 발생 0 ~ 4까지 발생
//		0일 경우 + 방향, 1일 경우 - 방향, 나머지는 정지
		int n = (int)(Math.random() * 5);
		
//		n == 0 이면 +값 사용
		if (n == 0) {
//			현재 좌표 x에 distance를 추가하여 저장
			x = x + distance;
		}
//		n == 1 이면 -값 사용
		else if (n == 1) {
//			현재 좌표의 x에 distance를 뺌
			x = x - distance;
		}
		
//		맵의 범위를 벗어나지 못 하게 함
		if ( x < 0) {
			x = 0;
		}
		
//		x가 범위를 벗어나지 못하게함
		if (x >= Game.MAX_X) {
			x = Game.MAX_X - 1; // 0부터 시작
		}
		
//		y축의 위치 변경
		n = (int)(Math.random() * 5);
		if (n == 0) {
			y = y + distance;
		}
		else if (n == 1) {
			y = y - distance;
		}
		
//		범위 밖으로 나오지 못하도록 정설
		if (y < 0) {
			y = 0;
		}
		
		if (y >= Game.MAX_Y) {
			y = Game.MAX_Y - 1;
		}
	}
	
	// Fish의 모양을 리턴
	@Override
	protected char getShape() {
		return '@';
	}
}
