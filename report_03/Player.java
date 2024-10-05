import java.util.Scanner;
import java.util.Random;

class Player {
    private String name;  // 선수 이름
    private int score;    // 승점

    // 생성자: 이름을 받아서 초기화
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    // 이름을 반환하는 메소드
    public String getName() {
        return name;
    }

    // 점수를 증가시키는 메소드
    public void addScore() {
        score++;
    }

    // 현재 점수를 반환하는 메소드
    public int getScore() {
        return score;
    }
}

public class GuessGame {
    private Player[] players;  // 게임에 참여하는 플레이어들
    private int playerCount;    // 플레이어 수
    private Random rand;        // 난수 생성기
    private Scanner scanner;    // 입력을 받기 위한 스캐너

    // 생성자: 게임에 참여할 선수 수를 입력받고 각 선수의 이름을 초기화
    public GuessGame() {
        scanner = new Scanner(System.in);
        rand = new Random();

        System.out.println("*** 예측 게임을 시작합니다. ***");
        System.out.print("게임에 참여할 선수 수>>");
        playerCount = scanner.nextInt();
        players = new Player[playerCount];

        // 선수 이름 입력 받기
        for (int i = 0; i < playerCount; i++) {
            System.out.print("선수 이름>>");
            String name = scanner.next();
            players[i] = new Player(name);  // 각 선수 객체 생성
        }
    }

    // 게임을 실행하는 메소드
    public void play() {
        while (true) {
            // 1~188 사이의 난수 생성
            int target = rand.nextInt(188) + 1;
            System.out.println("1~188사이의 숫자가 결정되었습니다. 선수들은 맞추어 보세요.");

            // 플레이어들이 숫자를 맞추는 부분
            int[] guesses = new int[playerCount];  // 각 플레이어의 추측을 저장할 배열
            for (int i = 0; i < playerCount; i++) {
                System.out.print(players[i].getName() + ">>");
                guesses[i] = scanner.nextInt();
            }

            // 정답과 가장 가까운 플레이어 찾기
            int winnerIndex = findClosestPlayer(target, guesses);

            // 승리한 플레이어에게 점수 부여
            System.out.println("정답은 " + target + "입니다. " + players[winnerIndex].getName() + "이(가) 이겼습니다. 승점 1점 확보!");
            players[winnerIndex].addScore();

            // 게임을 계속할지 여부 묻기
            System.out.print("계속하려면 yes 입력>>");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }

        // 게임 종료 후 최종 결과 출력
        printFinalScores();
    }

    // 정답과 가장 가까운 플레이어를 찾는 메소드
    private int findClosestPlayer(int target, int[] guesses) {
        int closestIndex = 0;
        int minDifference = Math.abs(target - guesses[0]);

        for (int i = 1; i < guesses.length; i++) {
            int difference = Math.abs(target - guesses[i]);
            if (difference < minDifference) {
                closestIndex = i;
                minDifference = difference;
            }
        }

        return closestIndex;
    }

    // 최종 결과 출력
    private void printFinalScores() {
        int highestScore = 0;
        Player winner = null;

        // 각 선수의 승점을 출력하고, 최종 승자를 찾음
        for (Player player : players) {
            System.out.println(player.getName() + ": " + player.getScore() + "점");
            if (player.getScore() > highestScore) {
                highestScore = player.getScore();
                winner = player;
            }
        }

        System.out.println(winner.getName() + "이(가) 최종 승리하였습니다.");
    }

    // main 메소드
    public static void main(String[] args) {
        GuessGame game = new GuessGame();  // 게임 객체 생성
        game.play();  // 게임 실행
    }
}
