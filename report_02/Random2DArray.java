package java_2024;
import java.util.Random;

public class Random2DArray {
    public static void main(String[] args) {
        int[][] array = new int[4][4]; // 4x4 크기의 2차원 배열 생성
        Random random = new Random();

        // 0~255 범위의 랜덤 정수를 배열에 저장
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(256); // 0부터 255까지의 랜덤 정수 생성
            }
        }

        // 배열 출력
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t"); // 요소를 탭으로 구분하여 출력
            }
            System.out.println(); // 각 행마다 줄 바꿈
        }
    }
}
