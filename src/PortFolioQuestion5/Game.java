package PortFolioQuestion5;

public class Game {
	public final static int MAX_X = 10; // 가로축 최대값
	public final static int MAX_Y = 20; // 세로축 최대값
	
//	화면에 출려될 실제 맵
	private char[][] map = new char[MAX_Y][MAX_X];
//	Bear, Fish의 객체가 저장될 배열
	private GameObject[] m = new GameObject[2];

	public Game() {
		for (int i = 0; i < MAX_Y; i++) {
			for (int j = 0; j < MAX_X; j++) {
				map[i][j] = '-';
			}
		}
		
		m[0] = new Bear(0, 0, 1);
		m[1] = new Fish(5, 5, 2);
	}
}
