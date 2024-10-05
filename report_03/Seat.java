import java.util.Scanner;

// 각 좌석을 나타내는 클래스
class Seat {
    private String[] seats;

    public Seat() {
        seats = new String[10];  // 좌석 10개 생성
        for (int i = 0; i < seats.length; i++) {
            seats[i] = "---";  // 초기 좌석 상태는 빈 좌석
        }
    }

    // 좌석 예약 메소드
    public boolean reserve(String name, int seatNumber) {
        if (seatNumber < 0 || seatNumber >= seats.length) {
            System.out.println("잘못된 좌석 번호입니다.");
            return false;
        }
        if (seats[seatNumber].equals("---")) {
            seats[seatNumber] = name;  // 좌석에 예약자 이름 입력
            return true;
        } else {
            System.out.println("이미 예약된 좌석입니다.");
            return false;
        }
    }

    // 좌석 취소 메소드
    public boolean cancel(String name) {
        for (int i = 0; i < seats.length; i++) {
            if (seats[i].equals(name)) {
                seats[i] = "---";  // 예약자 이름과 일치하면 취소
                return true;
            }
        }
        System.out.println("예약자를 찾을 수 없습니다.");
        return false;
    }

    // 좌석 상태 조회 메소드
    public void show() {
        for (int i = 0; i < seats.length; i++) {
            System.out.print(seats[i] + " ");
        }
        System.out.println();
    }
}

// 예약 시스템 클래스
public class ConcertReservationSystem {
    private Seat sSeat;
    private Seat aSeat;
    private Seat bSeat;

    public ConcertReservationSystem() {
        sSeat = new Seat();  // S석 좌석 배열 생성
        aSeat = new Seat();  // A석 좌석 배열 생성
        bSeat = new Seat();  // B석 좌석 배열 생성
    }

    // 좌석 타입에 따라 좌석 객체 반환
    private Seat getSeat(String seatType) {
        switch (seatType) {
            case "S":
                return sSeat;
            case "A":
                return aSeat;
            case "B":
                return bSeat;
            default:
                return null;
        }
    }

    // 예약 기능
    public void reserve() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("좌석구분 S(1), A(2), B(3)>> ");
        String seatType = scanner.next();
        Seat seat = getSeat(seatType.toUpperCase());

        if (seat == null) {
            System.out.println("잘못된 좌석 타입입니다.");
            return;
        }

        System.out.print("이름>> ");
        String name = scanner.next();
        System.out.print("번호>> ");
        int seatNumber = scanner.nextInt() - 1;  // 좌석 번호는 0부터 시작하므로 -1 처리

        if (!seat.reserve(name, seatNumber)) {
            System.out.println("예약 실패.");
        } else {
            System.out.println("예약 성공.");
        }
    }

    // 조회 기능
    public void show() {
        System.out.print("S석: ");
        sSeat.show();
        System.out.print("A석: ");
        aSeat.show();
        System.out.print("B석: ");
        bSeat.show();
    }

    // 취소 기능
    public void cancel() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("좌석구분 S(1), A(2), B(3)>> ");
        String seatType = scanner.next();
        Seat seat = getSeat(seatType.toUpperCase());

        if (seat == null) {
            System.out.println("잘못된 좌석 타입입니다.");
            return;
        }

        System.out.print("이름>> ");
        String name = scanner.next();

        if (!seat.cancel(name)) {
            System.out.println("취소 실패.");
        } else {
            System.out.println("취소 성공.");
        }
    }

    // 메인 루프 실행
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** 콘서트 예약 시스템을 시작합니다 ***");

        while (true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>> ");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    reserve();
                    break;
                case 2:
                    show();
                    break;
                case 3:
                    cancel();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }

    public static void main(String[] args) {
        ConcertReservationSystem system = new ConcertReservationSystem();
        system.run();
    }
}
