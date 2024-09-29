package java_2024;

import java.util.Scanner;

public class refrigerator {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        
        // 냉장고 상태를 정수로 입력 받기
        System.out.print("냉장고 상태 입력 (정수)>> ");
        int status = scanner.nextInt(); // 정수 입력 받음

        // 전원 상태 확인
        if ((status & 1) == 1) {
            System.out.print("전원 켜져 있음. ");
        } else {
            System.out.print("전원 꺼져 있음. ");
        }

        // 문 상태 확인
        if ((status & 2) == 2) {
            System.out.print("문 닫혀 있음. ");
        } else {
            System.out.print("문 열려 있음. ");
        }

        // 전구 상태 확인
        if ((status & 4) == 4) {
            System.out.print("전구 정상 작동. ");
        } else {
            System.out.print("전구 손상됨. ");
        }

        // 온도 상태 확인
        if ((status & 8) == 8) {
            System.out.print("냉장고 온도 3도 미만.");
        } else {
            System.out.print("냉장고 온도 3도 이상.");
        }
    }
}
