package java_2024;

import java.util.Scanner;

public class car {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        
        // 자동차 상태 입력 받기
        System.out.print("자동차 상태 입력>> ");
        int status = scanner.nextInt(); // 정수 입력 받음

        // 비트 0~5: 온도 추출 (하위 6비트 추출)
        int temperature = status & 0b00111111; 

        // 비트 6: 에어컨 상태 추출
        int acStatus = (status >> 6) & 1; 

        // 비트 7: 자동차 상태 추출
        int carRunningStatus = (status >> 7) & 1;

        // 자동차 상태 출력
        System.out.print("자동차는 ");
        if (carRunningStatus == 1) {
            System.out.print("달리는 상태이고 ");
        } else {
            System.out.print("정지 상태이고 ");
        }

        if (acStatus == 1) {
            System.out.print("에어컨이 켜진 상태이고 ");
        } else {
            System.out.print("에어컨이 꺼진 상태이고 ");
        }

        System.out.println("온도는 " + temperature + "도입니다.");
    }
}
