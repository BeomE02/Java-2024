package java_2024;

public class Cube {
    // 가로, 세로, 높이를 저장하는 private 멤버 변수 선언
    private int width;
    private int height;
    private int depth;

    // 생성자: 가로, 세로, 높이를 매개변수로 받아 초기화
    public Cube(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // 부피를 계산해서 반환하는 메소드
    public int getVolume() {
        return width * height * depth;
    }

    // 가로, 세로, 높이를 각각 증가시키는 메소드
    public void increase(int w, int h, int d) {
        this.width += w;
        this.height += h;
        this.depth += d;
    }

    // 부피가 0인지 확인하는 메소드
    public boolean isZero() {
        return getVolume() == 0;
    }

    // main 메소드: Cube 클래스 테스트
    public static void main(String[] args) {
        Cube cube = new Cube(1, 2, 3); // 가로, 세로, 높이가 1, 2, 3인 큐브 생성
        System.out.println("큐브의 부피는 " + cube.getVolume()); // 부피 출력

        cube.increase(1, 2, 3); // 가로, 세로, 높이 각각 1, 2, 3 증가
        System.out.println("큐브의 부피는 " + cube.getVolume()); // 증가 후 부피 출력

        if (cube.isZero()) {
            System.out.println("큐브의 부피는 0");
        } else {
            System.out.println("큐브의 부피는 0이 아님");
        }
    }
}
