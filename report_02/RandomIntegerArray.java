package java_2024;

import java.util.Random;

public class RandomIntegerArray {
    public static void main(String[] args) {
        int[] numbers = new int[10]; // 정수를 저장할 배열
        Random random = new Random();
        int sum = 0; // 합계를 계산하기 위한 변수

        // 랜덤 정수 생성 및 배열에 저장
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(9) + 11; // 11부터 19까지의 랜덤 정수 생성
            sum += numbers[i]; // 합계에 추가
        }

        // 배열에 저장된 정수 출력
        System.out.print("랜덤한 정수들... ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // 평균 계산
        double average = (double) sum / numbers.length;

        // 평균 출력
        System.out.printf("\n평균은 %.1f\n", average);
    }
}
