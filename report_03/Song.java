public class Song {
    // 노래의 제목, 가수 이름, 발표 년도, 가수 나라를 저장하는 필드
    private String title;
    private String singer;
    private int year;
    private String country;

    // 생성자: 제목, 가수, 발표 년도, 나라를 매개변수로 받아 초기화
    public Song(String title, String singer, int year, String country) {
        this.title = title;
        this.singer = singer;
        this.year = year;
        this.country = country;
    }

    // 노래 정보를 출력하는 메소드
    public void show() {
        System.out.println(year + "년 " + country + "의 " + singer + "가 부른 " + title);
    }

    // main 메소드: Song 클래스 테스트
    public static void main(String[] args) {
        // "가로수 그늘 아래 서면", "이문세", 1988, "한국"으로 Song 객체 생성
        Song song = new Song("가로수 그늘 아래 서면", "이문세", 1988, "한국");

        // 생성된 객체의 show() 메소드 호출하여 정보 출력
        song.show();
    }
}
