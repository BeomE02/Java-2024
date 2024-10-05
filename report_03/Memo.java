public class Memo {
    // 메모 작성자, 시점, 메모 텍스트를 저장하는 필드
    private String name;
    private String time;
    private String content;

    // 생성자: name, time, content를 매개변수로 받아 필드를 초기화
    public Memo(String name, String time, String content) {
        this.name = name;
        this.time = time;
        this.content = content;
    }

    // 메모 작성자의 이름을 리턴하는 메소드
    public String getName() {
        return name;
    }

    // 메모 내용을 출력하는 메소드
    public void show() {
        System.out.println(name + ", " + time + " " + content);
    }

    // 두 메모의 작성자가 같은지 비교하는 메소드
    public boolean isSameName(Memo other) {
        return this.name.equals(other.name);  // 작성자가 같으면 true 리턴
    }

    // 메모 텍스트의 길이를 리턴하는 메소드
    public int length() {
        return content.length();
    }

    // main 메소드: Memo 클래스 테스트
    public static void main(String[] args) {
        // Memo 객체 3개 생성
        Memo a = new Memo("유송연", "10:19", "자바 과제 있음");
        Memo b = new Memo("박채원", "10:15", "시카고로 어학 연수가요!");
        Memo c = new Memo("김경미", "11:30", "사랑하는 사람이 생겼어요.");

        // a 메모 내용 출력
        a.show();

        // a와 b의 작성자가 동일한지 비교
        if (a.isSameName(b)) {
            System.out.println("동일한 사람입니다.");
        } else {
            System.out.println("다른 사람입니다.");
        }

        // c의 작성자 이름과 메모 길이 출력
        System.out.println(c.getName() + "가 작성한 메모의 길이는 " + c.length());
    }
}
