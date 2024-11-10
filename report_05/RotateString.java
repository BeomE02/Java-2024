import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 문자열 입력 받기
        System.out.println("문자열을 입력하세요. 빈 칸이 있어도 되고 영어 한글 모두 됩니다.");
        String input = scanner.nextLine();

        int length = input.length();

        // 문자열 회전
        for (int i = 0; i < length; i++) {
            String rotated = input.substring(i) + input.substring(0, i);
            System.out.println(rotated);
        }

        scanner.close();
    }
}
