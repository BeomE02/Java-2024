package java_2024;

import java.util.Random;
import java.util.Scanner;

public class GamblingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String continueGame;

        System.out.println("***** 갬블링 게임을 시작합니다. *****");

        do {
            boolean jackpot = false; // 대박 여부를 저장할 변수

            while (!jackpot) {
                System.out.print("엔터키 입력>> ");
                scanner.nextLine(); // 엔터키 입력 대기

                // 0, 1, 2 중 랜덤하게 3개의 수 생성
                int num1 = random.nextInt(3);
                int num2 = random.nextInt(3);
                int num3 = random.nextInt(3);

                // 결과 출력
                System.out.println(num1 + " " + num2 + " " + num3);

                // 모두 같은 값인지 체크
                if (num1 == num2 && num2 == num3) {
                    System.out.println("성공! 대박났어요!");
                    jackpot = true; // 대박 발생
                }
            }

            // 게임 계속 여부 확인
            System.out.print("계속하시겠습니까? (yes/no)>> ");
            continueGame = scanner.nextLine();

        } while (continueGame.equalsIgnoreCase("yes")); // "yes" 입력 시 계속

        System.out.println("게임을 종료합니다.");
        scanner.close(); // 스캐너 닫기
    }
}
