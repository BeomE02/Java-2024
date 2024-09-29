package java_2024;

import java.util.Scanner;

public class MultiplesOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10]; // 양의 정수 18개를 저장할 배열

        System.out.print("양의 정수 10개 입력>> ");
        
        // 18개의 양의 정수 입력 받기
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("3의 배수는.. ");

        // 3의 배수 출력
        for (int number : numbers) {
            if (number % 3 == 0) {
                System.out.print(number + " ");
            }
        }

        System.out.println(); // 줄 바꿈
        scanner.close(); // 스캐너 닫기
    }
}
