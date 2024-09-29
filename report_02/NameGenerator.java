package java_2024;

import java.util.Random;
import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] boyMiddleList = {"기", "민", "용", "종", "현", "진", "재", "승", "소", "상", "지"};
        String[] boyLastList = {"태", "진", "광", "혁", "우", "철", "빈", "준", "구", "호", "석"};
        String[] girlMiddleList = {"은", "원", "경", "수", "현", "예", "여", "송", "서", "채", "하"};
        String[] girlLastList = {"진", "연", "경", "서", "리", "숙", "미", "원", "린", "희", "수"};

        System.out.println("***** 작명 프로그램이 실행됩니다. *****");

        while (true) {
            System.out.print("남/여 선택>> ");
            String gender = scanner.next(); // 남/여 입력받기

            if (gender.equals("그만")) {
                break; // "그만" 입력 시 종료
            }

            if (gender.equals("남")) {
                System.out.print("성 입력>> ");
                String lastName = scanner.next(); // 성 입력받기
                // 랜덤한 중간 이름 생성
                String middleName = boyMiddleList[random.nextInt(boyMiddleList.length)];
                String fullName = lastName + middleName + "우"; // '우'로 고정
                System.out.println("추천 이름: " + fullName);
            } else if (gender.equals("여")) {
                System.out.print("성 입력>> ");
                String lastName = scanner.next(); // 성 입력받기
                // 랜덤한 중간 이름 생성
                String middleName = girlMiddleList[random.nextInt(girlMiddleList.length)];
                String fullName = lastName + middleName + "진"; // '진'으로 고정
                System.out.println("추천 이름: " + fullName);
            } else {
                System.out.println("남/여/그만 중에서 입력하세요!");
            }
        }

        System.out.println("프로그램을 종료합니다.");
        scanner.close(); // 스캐너 닫기
    }
}
