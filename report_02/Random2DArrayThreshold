package java_2024;

import java.util.Random;
import java.util.Scanner;

public class Random2DArrayThreshold {
    public static void main(String[] args) {
        int[][] array = new int[4][4]; // 4x4 크기의 2차원 배열 생성
        Random random = new Random();

        // 0~255 범위의 랜덤 정수를 배열에 저장
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(256); // 0부터 255까지의 랜덤 정수 생성
            }
        }

        // 초기 배열 출력
        System.out.println("4x4 배열에 랜덤한 값을 저장한 후 출력합니다.");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\n"); // 각 요소를 개행으로 출력
            }
        }

        // 임계값 입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("임계값 입력>> ");
        int threshold = scanner.nextInt(); // 사용자로부터 임계값 입력받기

        // 배열 수정
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > threshold) {
                    array[i][j] = 255; // 임계값보다 크면 255로 변경
                } else {
                    array[i][j] = 0; // 임계값보다 작거나 같으면 8로 변경
                }
            }
        }

        // 수정된 배열 출력
        System.out.println("수정된 배열:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\n"); // 각 요소를 개행으로 출력
            }
        }

        scanner.close(); // 스캐너 닫기
    }
}
