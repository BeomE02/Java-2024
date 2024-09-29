import java.util.Scanner;

public class StarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        // 양의 정수가 입력될 때까지 계속 입력 받기
        do {
            System.out.print("양의 정수 입력>> ");
            number = scanner.nextInt();
        } while (number <= 0); // 양의 정수인지 확인

        // 입력받은 양의 정수에 따라 별 출력
        for (int i = number; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }

        scanner.close(); // 스캐너 닫기
    }
}
