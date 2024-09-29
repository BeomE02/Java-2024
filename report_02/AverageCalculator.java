package java_2024;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요. (입력 끝은 'end') >> ");
        
        String input = scanner.nextLine(); // 한 줄 입력받기
        String[] numbers = input.split(" "); // 공백으로 나누기
        
        int sum = 0; // 합계
        int count = 0; // 양의 정수 개수
        
        for (String number : numbers) {
            try {
                int num = Integer.parseInt(number); // 문자열을 정수로 변환
                if (num > 0) { // 양수인지 확인
                    sum += num; // 합계에 추가
                    count++; // 카운트 증가
                } else {
                    System.out.println(num + " 제외"); // 음수일 경우 제외 메시지
                }
            } catch (NumberFormatException e) {
                System.out.println(number + " 제외"); // 변환할 수 없는 경우 제외 메시지
            }
        }

        // 평균 계산 및 출력
        if (count > 0) {
            double average = (double) sum / count; // 평균 계산
            System.out.printf("평균은 %.2f\n", average); // 소수점 둘째자리까지 출력
        } else {
            System.out.println("양의 정수가 입력되지 않았습니다.");
        }

        scanner.close(); // 스캐너 닫기
    }
}
