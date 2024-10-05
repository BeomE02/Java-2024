public class Account {
    // 잔금을 저장하는 필드
    private int balance;

    // 생성자: 초기 예금액을 받아서 잔액을 초기화
    public Account(int initialDeposit) {
        this.balance = initialDeposit;
    }

    // 현재 잔액을 리턴하는 메소드
    public int getBalance() {
        return balance;
    }

    // 입금 메소드: 하나의 금액을 입금
    public void deposit(int amount) {
        balance += amount;  // 잔액에 더해줌
    }

    // 입금 메소드: 배열로 여러 금액을 입금
    public void deposit(int[] amounts) {
        for (int amount : amounts) {
            balance += amount;  // 배열의 각 금액을 잔액에 더해줌
        }
    }

    // 인출 메소드: 요청한 금액을 인출하고, 실제 인출된 금액을 리턴
    public int withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;  // 잔액이 충분하면 요청 금액만큼 인출
            return amount;      // 실제 인출된 금액 반환
        } else {
            int temp = balance; // 잔액이 부족하면 가능한 잔액만큼 인출
            balance = 0;        // 잔액 0으로 설정
            return temp;        // 실제 인출된 금액 반환
        }
    }

    // main 메소드: Account 클래스 테스트
    public static void main(String[] args) {
        // 초기 예금액 180원으로 계좌 생성
        Account a = new Account(180);

        // 5000원 입금
        a.deposit(5000);
        System.out.println("잔금은 " + a.getBalance() + "원입니다.");

        // 여러 금액을 한꺼번에 입금
        int bulk[] = {100, 590, 200, 700};
        a.deposit(bulk);
        System.out.println("잔금은 " + a.getBalance() + "원입니다.");

        // 1000원 인출
        int money = 1000;
        int wMoney = a.withdraw(money);  // 실제 인출된 금액 반환받음

        // 인출된 금액이 요청 금액보다 적은지 확인
        if (wMoney < money) {
            System.out.println(wMoney + "원만 인출");
        } else {
            System.out.println(wMoney + "원 인출");
        }

        // 최종 잔금 출력
        System.out.println("잔금은 " + a.getBalance() + "원입니다.");
    }
}
