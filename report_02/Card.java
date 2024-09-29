package java_2024;

import java.util.Random;
import java.util.Scanner;

public class Card {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;

        do {
            // 0에서 99 사이의 임의의 수를 생성
            int hiddenNumber = random.nextInt(100);
            System.out.println("수를 결정하였습니다. 맞추어 보세요");
            System.out.println("0-99");

            int min = 0; // 범위의 최소값
            int max = 99; // 범위의 최대값
            int guess; // 사용자의 추측값

            // 사용자가 맞출 때까지 반복
            do {
                System.out.print(">> ");
                guess = scanner.nextInt(); // 사용자 입력 받기

                // 추측한 수에 따라 힌트 제공
                if (guess < hiddenNumber) {
                    System.out.println("더 높게");
                    min = guess + 1; // 최소값 업데이트
                } else if (guess > hiddenNumber) {
                    System.out.println("더 낮게");
                    max = guess - 1; // 최대값 업데이트
                } else {
                    System.out.println("맞았습니다.");
                }

                // 현재 범위 출력
                if (guess != hiddenNumber) {
                    System.out.println(min + "-" + max);
                }

            } while (guess != hiddenNumber); // 맞출 때까지 반복

            // 게임 반복 여부 확인
            System.out.print("다시하시겠습니까(y/n)>> ");
            char response = scanner.next().charAt(0); // 사용자 입력 받기
            playAgain = (response == 'y' || response == 'Y');

        } while (playAgain); // 사용자가 'y'를 입력할 경우 게임 재시작

        System.out.println("게임 종료");
        scanner.close(); // Scanner 객체 닫기
    }
}
