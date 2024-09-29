package java_2024;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        
        System.out.print("양의 정수 10개 입력>> ");
        
        // 양의 정수 10개 입력받기
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        System.out.print("자리수의 합이 9인 것은 •••");
        
        // 자리수의 합이 9인 수 찾기
        for (int number : numbers) {
            if (sumOfDigits(number) == 9) {
                System.out.print(" " + number);
            }
        }

        System.out.println(); // 줄바꿈
        scanner.close(); // 스캐너 닫기
    }

    // 자리수의 합을 계산하는 메소드
    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10; // 마지막 자리수 더하기
            number /= 10; // 마지막 자리수 제거
        }
        return sum;
    }
}
