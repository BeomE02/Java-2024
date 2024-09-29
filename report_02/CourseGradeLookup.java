package java_2024;

import java.util.Scanner;

public class CourseGradeLookup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] course = {"C", "C++", "python", "Java", "HTML5"};
        String[] grade = {"A", "B+", "B", "A+", "D"};

        System.out.println("***** 과목과 학점을 조회하는 프로그램 *****");

        while (true) {
            System.out.print("과목>> ");
            String inputCourse = scanner.nextLine(); // 과목 입력받기

            if (inputCourse.equals("그만")) {
                break; // "그만" 입력 시 종료
            }

            // 과목을 찾기 위한 플래그
            boolean found = false;

            // 입력한 과목과 배열의 과목 비교
            for (int i = 0; i < course.length; i++) {
                if (inputCourse.equalsIgnoreCase(course[i])) { // 대소문자 구분 없이 비교
                    System.out.println(inputCourse + " 학점은 " + grade[i] + "입니다.");
                    found = true;
                    break; // 과목이 발견되면 루프 종료
                }
            }

            if (!found) {
                System.out.println(inputCourse + "는 없는 과목입니다.");
            }
        }

        System.out.println("프로그램을 종료합니다.");
        scanner.close(); // 스캐너 닫기
    }
}
