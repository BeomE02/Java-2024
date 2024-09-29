package java_2024;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentScoreSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] studentIds = new int[10];
        int[] scores = new int[10];

        System.out.println("10명 학생의 학번과 점수 입력");

        // 학생의 학번과 점수를 입력받기
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ">> ");
            try {
                studentIds[i] = scanner.nextInt();
                scores[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("경고!! 정수를 입력하세요.");
                scanner.nextLine(); // 잘못된 입력을 소비하고 재입력을 받음
                i--; // 다시 입력받기 위해 인덱스 감소
            }
        }

        while (true) {
            System.out.print("학번으로 검색: 1, 점수로 검색: 2, 끝내려면 3>> ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("경고!! 정수를 입력하세요.");
                scanner.nextLine(); // 잘못된 입력을 소비
                continue; // 다시 입력받기
            }

            if (choice == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (choice == 1) { // 학번으로 검색
                System.out.print("학번>> ");
                int id;
                try {
                    id = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("경고!! 정수를 입력하세요.");
                    scanner.nextLine();
                    continue;
                }

                boolean found = false;
                for (int i = 0; i < studentIds.length; i++) {
                    if (studentIds[i] == id) {
                        System.out.println(id + "점수는 " + scores[i] + "점입니다.");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println(id + "의 학생은 없습니다.");
                }

            } else if (choice == 2) { // 점수로 검색
                System.out.print("점수>> ");
                int score;
                try {
                    score = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("경고!! 정수를 입력하세요.");
                    scanner.nextLine();
                    continue;
                }

                StringBuilder studentList = new StringBuilder();
                for (int i = 0; i < scores.length; i++) {
                    if (scores[i] == score) {
                        studentList.append(studentIds[i]).append(" ");
                    }
                }

                if (studentList.length() > 0) {
                    System.out.println("점수가 " + score + "인 학생은 " + studentList.toString().trim() + "입니다.");
                } else {
                    System.out.println("점수가 " + score + "인 학생은 없습니다.");
                }

            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }

        scanner.close(); // 스캐너 닫기
    }
}
