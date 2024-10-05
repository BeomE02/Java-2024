import java.util.Scanner;

class Dictionary {
    // 한글 단어 배열과 대응하는 영어 단어 배열
    private static String[] kor = { "사랑", "아기", "돈", "미래", "희망" };
    private static String[] eng = { "love", "baby", "money", "future", "hope" };

    // 한글 단어를 영어로 번역하는 메소드
    public static String kor2Eng(String word) {
        // 한글 배열에서 해당 단어의 위치를 찾고, 대응되는 영어 단어 반환
        for (int i = 0; i < kor.length; i++) {
            if (kor[i].equals(word)) {
                return eng[i];  // 한글 단어에 맞는 영어 단어 반환
            }
        }
        return null;  // 사전에 없는 단어일 경우 null 반환
    }
}

public class DicApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");

        while (true) {
            System.out.print("한글 단어?");
            String word = scanner.next();  // 사용자로부터 한글 단어 입력받음

            if (word.equals("그만")) {
                // 사용자가 "그만"을 입력하면 프로그램 종료
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // Dictionary 클래스의 kor2Eng 메소드를 이용하여 번역
            String translation = Dictionary.kor2Eng(word);

            if (translation != null) {
                // 번역된 단어가 있을 경우 출력
                System.out.println(word + "은 " + translation);
            } else {
                // 사전에 없는 단어일 경우 메시지 출력
                System.out.println(word + "는 저의 사전에 없습니다.");
            }
        }

        scanner.close();
    }
}
