package PortFolioQuestion3;

import java.util.Scanner;

public class WordGame {
	private Scanner sc; // 사용자 입력
	private String startWord = "겨울한파"; // 시작단어
	private Player[] players; // 게임 참가자
	
	public WordGame() {
		sc = new Scanner(System.in);
	}
	
	private void createPlayers() {
		System.out.print("게임에 참가하는 인원은 몇명입니까? ");
//		게임 참가자 숫자 입력 받음
		int nPlayers = sc.nextInt();
		
//		클래스의 배열 : players = new Player[nPlayer]; 이렇게 하면 배열의 객체만 생성됨
//		해당 배열의 요소인 클래스 타입의 객체는 생성되지 않음
		players = new Player[nPlayers];
		
		
		for (int i = 0; i < nPlayers; i++) {
			System.out.print("참가자의 이름을 입력하세요 >> ");
			String name = sc.next();
//			배열 요소의 클래스 타입일 경우 각 요소마타 new 키워드를 이용하여 해당 클래스 타입의 객체를 생성함
			players[i] = new Player(name);
		}
	}
	
	public void run() {
		System.out.println("끝말잇기 게임을 시작합니다.");
		createPlayers(); // 끝말잇기 참자가 생성
//		String[] arrStartWord = {"북극한파", "코로나19", "확진자", "삼립호빵"};
//		
//		Random r = new Random();
//		int index = r.nextInt(4);
//		
//		String lastWord = arrStartWord[index];
		String lastWord = startWord;
		
		System.out.println("시작하는 단어는 " + lastWord + "입니다.");
		int next = 0; // 게임 참가자 순서
		
		while (true) {
//			새로운 단어 가져오기
			String newWord = players[next].getWordFromUser(); // 새단어 만들기
			if (!players[next].checkSuccess(lastWord)) {
				System.out.print(players[next].getName() + "이(가) 졌습니다.");
				break;
			}
			next++; // 게임 참가자 순서 카운트
//			next = next % players.length;
			next %= players.length;
			lastWord = newWord;
		}
	}
}
