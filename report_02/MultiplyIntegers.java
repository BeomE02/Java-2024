package java_2024;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplyIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0; // 첫 번째 정수
        int m = 0; // 두 번째 정수
        boolean validInput = false; // 유효한 입력 여부를 저장할 변수

        while (!validInput) { // 유효한 입력이 들어올 때까지 반복
            System.out.print("곱하고자 하는 정수 2개 입력>> ");
            try {
                n = scanner.nextInt(); // 첫 번째 정수 입력
                m = scanner.nextInt(); // 두 번째 정수 입력
                validInput = true; // 유효한 입력이 들어왔으므로 true로 변경
            } catch (InputMismatchException e) {
                System.out.println("정수를 입력하세요!"); // 오류 메시지 출력
                scanner.nextLine(); // 잘못된 입력을 버리기 위해 라인 읽기
            }
        }

        System.out.println(n + " x " + m + " = " + (n * m)); // 곱 출력
        scanner.close(); // 스캐너 닫기
    }
}
