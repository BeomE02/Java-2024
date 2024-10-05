import java.util.Scanner;

public class Grade {
    // 이름과 3개의 과목 점수를 저장하는 private 멤버 변수 선언
    private String name;
    private int java;
    private int web;
    private int os;

    // 생성자: 이름과 각 과목 점수를 매개변수로 받아 초기화
    public Grade(String name, int java, int web, int os) {
        this.name = name;
        this.java = java;
        this.web = web;
        this.os = os;
    }

    // 학생 이름을 반환하는 메소드
    public String getName() {
        return name;
    }

    // 성적 평균을 계산해서 반환하는 메소드
    public double getAverage() {
        return (java + web + os) / 3.0; // 소수점 평균을 계산하기 위해 3.0으로 나눔
    }

    // main 메소드: Grade 클래스 테스트
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자 입력을 받기 위한 스캐너 객체 생성
        System.out.print("이름, 자바, 웹프로그래밍, 운영체제 순으로 점수 입력>>");
        
        String name = scanner.next(); // 이름 입력 받음
        int java = scanner.nextInt(); // 자바 점수 입력 받음
        int web = scanner.nextInt();  // 웹프로그래밍 점수 입력 받음
        int os = scanner.nextInt();   // 운영체제 점수 입력 받음

        // Grade 객체 생성
        Grade st = new Grade(name, java, web, os);

        // 학생 이름과 평균 출력
        System.out.println(st.getName() + "의 평균은 " + st.getAverage());

        scanner.close(); // 스캐너 닫기
    }
}
