package java_2024;

import java.util.Random;
import java.util.Scanner;

public class RandomIntegerAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("몇 개의 정수를 저장하시겠습니까>> ");
        int count = scanner.nextInt(); // 사용자로부터 정수 개수 입력받기

        int[] numbers = new int[count]; // 입력된 개수만큼의 배열 생성
        int sum = 0; // 합계를 저장할 변수

        // 랜덤 정수 생성 및 배열에 저장
        for (int i = 0; i < count; i++) {
            numbers[i] = random.nextInt(100) + 1; // 1부터 100까지의 랜덤 정수 생성
            sum += numbers[i]; // 합계 계산
        }

        // 배열에 저장된 정수 출력
        System.out.print("랜덤한 정수들... ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // 평균 계산
        double average = (double) sum / count;

        // 평균 출력
        System.out.println("\n평균은 " + average);
        
        scanner.close(); // 스캐너 닫기
    }
}
