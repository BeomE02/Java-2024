public class Rectangle {
    // 사각형의 점과 크기를 나타내는 필드
    private int x;      // 좌상단 x 좌표
    private int y;      // 좌상단 y 좌표
    private int width;  // 사각형의 너비
    private int height; // 사각형의 높이

    // 생성자: x, y, width, height를 매개변수로 받아 필드들을 초기화
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // 사각형의 정보를 출력하는 메소드
    public void show() {
        System.out.println("(" + x + ", " + y + ")에서 크기가 " + width + "x" + height + "인 사각형");
    }

    // 사각형이 정사각형인지 확인하는 메소드
    public boolean isSquare() {
        return width == height;
    }

    // 현재 사각형이 다른 사각형을 포함하는지 확인하는 메소드
    public boolean contains(Rectangle r) {
        // 현재 사각형이 다른 사각형 r을 포함하는지 확인
        return (this.x <= r.x) && (this.y <= r.y) && 
               (this.x + this.width >= r.x + r.width) && 
               (this.y + this.height >= r.y + r.height);
    }

    // main 메소드: Rectangle 클래스 테스트
    public static void main(String[] args) {
        // (3,3) 점에서 6x6 크기의 사각형 a 생성
        Rectangle a = new Rectangle(3, 3, 6, 6);
        // (4,4) 점에서 2x3 크기의 사각형 b 생성
        Rectangle b = new Rectangle(4, 4, 2, 3);

        a.show();  // a 사각형 정보 출력

        // a가 정사각형인지 확인
        if (a.isSquare()) {
            System.out.println("a는 정사각형입니다.");
        } else {
            System.out.println("a는 직사각형입니다.");
        }

        // a가 b를 포함하는지 확인
        if (a.contains(b)) {
            System.out.println("a는 b를 포함합니다.");
        } else {
            System.out.println("a는 b를 포함하지 않습니다.");
        }
    }
}
