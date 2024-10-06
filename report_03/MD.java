import java.util.Scanner;

public class MD {
    private D[] d;
    private int y;
    private int m;

    public MD(int y, int m) {
        this.y = y;
        this.m = m;
        this.d = new D[30];
        for (int i = 0; i < 30; i++) {
            d[i] = new D();
        }
    }

    public void run() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int c = getMenu(sc);

            if (c == 1) {
                write(sc);
            } else if (c == 2) {
                show();
            } else if (c == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
            }
        }

        sc.close();
    }

    private int getMenu(Scanner sc) {
        System.out.println("\n***** " + y + "년 " + m + "월 다이어리 *****");
        System.out.println("기록:1, 보기:2, 종료:3");
        System.out.print(">> ");
        return sc.nextInt();
    }

    private void write(Scanner sc) {
        System.out.print("날짜(1~30)>> ");
        int day = sc.nextInt();

        if (day < 1 || day > 30) {
            System.out.println("잘못된 날짜입니다. 1~30 사이로 입력해주세요.");
            return;
        }

        System.out.print("텍스트(빈칸없이 4글자이하)>> ");
        String memo = sc.next();
        d[day - 1].setM(memo);
    }

    private void show() {
        System.out.println("2024년 10월 달력:");
        for (int i = 0; i < 30; i++) {
            String memo = d[i].getM();
            if (memo.isEmpty()) {
                System.out.print("•••\t");
            } else {
                System.out.print(memo + "\t");
            }

            if ((i + 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
