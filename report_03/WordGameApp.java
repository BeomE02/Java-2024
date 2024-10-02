package Hello.eclipse;

import java.util.Scanner;

class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 참가자가 단어를 입력하는 메소드
    public String sayWord() {
        Scanner sc = new Scanner(System.in);
        System.out.print(name + ">> ");
        return sc.next();
    }
}

public class WordGameApp {
    private Player[] players;
    private String currentWord = "아버지"; // 시작 단어

    public WordGameApp(int playerCount) {
        players = new Player[playerCount];
        Scanner sc = new Scanner(System.in);

        // 플레이어들의 이름을 입력받음
        for (int i = 0; i < playerCount; i++) {
            System.out.print("참가자의 이름을 입력하세요>> ");
            players[i] = new Player(sc.next());
        }
    }

    // 게임을 실행하는 메소드
    public void run() {
        System.out.println("시작하는 단어는 " + currentWord + "입니다.");

        int playerIndex = 0; // 현재 차례인 플레이어의 인덱스
        while (true) {
            // 현재 플레이어가 단어를 입력함
            Player currentPlayer = players[playerIndex];
            String newWord = currentPlayer.sayWord();

            // 끝말잇기 규칙을 확인 (이전 단어의 마지막 글자와 새 단어의 첫 글자가 같은지)
            if (currentWord.charAt(currentWord.length() - 1) == newWord.charAt(0)) {
                currentWord = newWord; // 규칙에 맞으면 현재 단어 갱신
            } else {
                // 규칙에 맞지 않으면 게임 종료
                System.out.println(currentPlayer.getName() + "이(가) 졌습니다.");
                break;
            }

            // 다음 플레이어로 순서 변경
            playerIndex = (playerIndex + 1) % players.length;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("끝말잇기 게임을 시작합니다.");
        System.out.print("게임에 참가하는 인원은 몇명입니까>> ");
        int playerCount = sc.nextInt();

        // WordGameApp 객체 생성 및 게임 실행
        WordGameApp game = new WordGameApp(playerCount);
        game.run();
    }
}
