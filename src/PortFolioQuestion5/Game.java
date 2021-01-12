package PortFolioQuestion5;

public class Game {
//	상수 사용
	public final static int MAX_X = 20; // 가로축 최대값
	public final static int MAX_Y = 10; // 세로축 최대값
	
//	화면에 출력될 실제 맵
	private char[][] map = new char[MAX_Y][MAX_X];
//	Bear, Fish의 객체가 저장될 배열
	private GameObject[] m = new GameObject[2];

	public Game() {
//		전체 맵을 그려줌
//		처음에는 전체 맵이 비어있음
		for (int i = 0; i < MAX_Y; i++) {
			for (int j = 0; j < MAX_X; j++) {
				map[i][j] = '-';
			}
		}
		
		m[0] = new Bear(0, 0, 1);
		m[1] = new Fish(5, 5, 1);
	}
	
	public void run() {
		System.out.println("** Bear의 Fish 먹기 게임을 시작합니다.**");
		
		update(); // Bear과 Fish의 위치를 그려줌
		draw();
		
		while(!doesEnd()) {
			clear();
			
			for (int i = 0; i < m.length; i++) {
				m[i].move(); // Bear, Fish의 위치 이동
			}
			
			update();
			draw();
		}
		
		System.out.println("Bear Wins!!");;
	}
	
//	Bear과 Fish를 차례대로 그려서 만약 겹칠 경우 먼저 그러진 것을 덮어씌우기 위한 것
	private void update() {
//		카운트 부분에서 i--; 인 이유는 Bear과 Fish가 저장되어 있는 배열 m의 저장 차례가 Bear가 먼저이고 Fish가 나중이기 때문
//		Bear와 Fish가 같은 위치에 있을 경우 Fish가 먼저 그려지고 나중에 Bear가 그려지는 형태가 되어야 하기 때문
		for (int i = m.length - 1; i >= 0; i--) {
			map[m[i].getY()][m[i].getX()] = m[i].getShape();
		}
	}
	
//	Bear와 Fish가 이전에 있던 위치를 원래 맵 모양으로 다시 변경
	private void clear() {
		for (int i = 0; i < m.length; i++) {
			map[m[i].getY()][m[i].getX()] = '-';
		}
	}
	
//	맵 화면에 그리기
	private void draw() {
		System.out.println();
		
		for (int i = 0; i < MAX_Y; i++) {
			for (int j = 0; j < MAX_X; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	
//	Bear와 Fish가 같은 위치에 있는지 확인
//	배열 m은 다형성을 통해서 Bear와 Fish를 저장하고 있음
//	m[0] : Bear 저장
//	m[1] : Fish 저장
	private boolean doesEnd() {
//		Bear를 기준으로 해서 Fish를 매개변수로 사용
		if (m[0].collide(m[1])) {
			return true;
		}
		
		return false;
	}
}








